package Assign_26_A_feb;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
public class CsvToJson {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("C:/Users/POOJA/Desktop/Capgemini_Training/src/main/java/Assign_26_A_feb/data.csv");
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withFirstRecordAsHeader());

            List<Map<String, String>> recordsList = new ArrayList<>();
            for (CSVRecord record : csvParser) {
                recordsList.add(record.toMap());
            }

            ObjectMapper objectMapper = new ObjectMapper();
            String jsonOutput = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(recordsList);

            System.out.println("Converted JSON:");
            System.out.println(jsonOutput);

            csvParser.close();
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
