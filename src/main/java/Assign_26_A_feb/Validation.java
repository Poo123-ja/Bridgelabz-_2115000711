package Assign_26_A_feb;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
public class Validation {
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            File jsonFile = new File("C:/Users/POOJA/Desktop/Capgemini_Training/src/main/java/Assign_26_A_feb/data.json");
            JsonNode jsonNode = objectMapper.readTree(jsonFile);
            if (isValidJson(jsonNode)) {
                System.out.println("Valid JSON structure!");
            } else {
                System.out.println("Invalid JSON structure!");
            }
        } catch (IOException e) {
            System.out.println("Error reading JSON file: " + e.getMessage());
        }
    }
    private static boolean isValidJson(JsonNode jsonNode) {
        return jsonNode.has("name") && jsonNode.has("email");
    }
}
