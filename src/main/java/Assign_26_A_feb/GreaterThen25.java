package Assign_26_A_feb;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.Iterator;

public class GreaterThen25 {
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode rootNode = objectMapper.readTree(new File("C:/Users/POOJA/Desktop/Capgemini_Training/src/main/java/Assign_26_A_feb/people.json"));
            if (rootNode.isArray()) {
                for (JsonNode user : rootNode) {
                    if (user.has("age") && user.get("age").asInt() > 25) {
                        System.out.println(user.toString());
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
