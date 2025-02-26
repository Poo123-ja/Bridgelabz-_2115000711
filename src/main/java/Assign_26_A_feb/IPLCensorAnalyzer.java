
package Assign_26_A_feb;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.apache.commons.csv.*;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class IPLCensorAnalyzer {
    public static void main(String[] args) {
        String jsonInput = "C:\\Users\\POOJA\\Desktop\\Capgemini_Training\\src\\main\\java\\Assign_26_A_feb\\ipl_dataJSON.json";
        String jsonOutput = "src/main/resources/output.json";
        String csvInput = "C:\\Users\\POOJA\\Desktop\\Capgemini_Training\\src\\main\\java\\Assign_26_A_feb\\ipl_data.csv";
        String csvOutput = "src/main/resources/output.csv";

        try {
            processJsonFile(jsonInput, jsonOutput);
            processCsvFile(csvInput, csvOutput);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void processJsonFile(String inputFile, String outputFile) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode rootArray = objectMapper.readTree(new File(inputFile));

        for (JsonNode match : rootArray) {
            ((ObjectNode) match).put("team1", maskTeamName(match.get("team1").asText()));
            ((ObjectNode) match).put("team2", maskTeamName(match.get("team2").asText()));
            ((ObjectNode) match).put("winner", maskTeamName(match.get("winner").asText()));
            ((ObjectNode) match).put("player_of_match", "REDACTED");
        }

        objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(outputFile), rootArray);
        System.out.println("Censored JSON saved to: " + outputFile);
    }

    private static void processCsvFile(String inputFile, String outputFile) throws IOException {
        Reader reader = Files.newBufferedReader(Paths.get(inputFile));
        CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withFirstRecordAsHeader());
        BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputFile));
        CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader(csvParser.getHeaderNames().toArray(new String[0])));

        for (CSVRecord record : csvParser) {
            csvPrinter.printRecord(
                    record.get("match_id"),
                    maskTeamName(record.get("team1")),
                    maskTeamName(record.get("team2")),
                    record.get("score_team1"),
                    record.get("score_team2"),
                    maskTeamName(record.get("winner")),
                    "REDACTED"
            );
        }

        csvParser.close();
        csvPrinter.close();
        System.out.println("Censored CSV saved to: " + outputFile);
    }

    private static String maskTeamName(String teamName) {
        String[] words = teamName.split(" ");
        return words.length > 1 ? words[0] + " ***" : teamName;
    }
}
