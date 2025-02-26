package Assign_26_A_feb;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
    public class ReadJSON {
        public static void main(String[] args) {
            try {
                ObjectMapper objectMapper = new ObjectMapper();
                File file = new File("C:/Users/POOJA/Desktop/Capgemini_Training/srcmain/java/Assign_26_A_feb/data.json");
                JsonNode rootNode = objectMapper.readTree(file);
                String name = rootNode.get("name").asText();
                String email = rootNode.get("email").asText();
                System.out.println("Name: " + name);
                System.out.println("Email: " + email);
            } catch (Exception e) {
                    System.out.println("An error occurred: " + e.getMessage());
                }

            }
        }


