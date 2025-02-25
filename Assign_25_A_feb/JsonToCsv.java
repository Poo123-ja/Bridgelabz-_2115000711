import org.json.JSONArray;
import org.json.JSONObject;
import org.json.CDL;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonToCsv {

public static String readFile(String filePath) throws IOException {
return new String(Files.readAllBytes(Paths.get(filePath))) + "\n";
}

public static void jsonToCsv(String jsonFile, String csvFile) throws IOException {
String jsonData = readFile(jsonFile);
JSONArray jsonArray = new JSONArray(jsonData);
String csvData = CDL.toString(jsonArray) + "\n";

try (PrintWriter writer = new PrintWriter(new FileWriter(csvFile))) {
writer.write(csvData);
System.out.println("CSV file saved: " + csvFile + "\n");
}
}

public static void csvToJson(String csvFile, String jsonFile) throws IOException {
String csvData = readFile(csvFile);
JSONArray jsonArray = CDL.toJSONArray(csvData);

try (PrintWriter writer = new PrintWriter(new FileWriter(jsonFile))) {
writer.write(jsonArray.toString(4) + "\n");
System.out.println("JSON file saved: " + jsonFile + "\n");
}
}

public static void main(String[] args) {
try {
String jsonInput = "students.json";
String csvOutput = "student.csv";
String jsonOutput = "converted_students.json";

jsonToCsv(jsonInput, csvOutput);

csvToJson(csvOutput, jsonOutput);

} catch (Exception e) {
e.printStackTrace();
}
}
}
