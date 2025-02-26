package Assign_26_A_feb;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.Iterator;
import java.util.Map;

public class KeyValue {
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode rootNode = objectMapper.readTree(new File("C:/Users/POOJA/Desktop/Capgemini_Training/src/main/java/Assign_26_A_feb/data.json"));
            printJson(rootNode, "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void printJson(JsonNode node, String prefix) {
        if (node.isObject()) {
            Iterator<Map.Entry<String, JsonNode>> fields = node.fields();
            while (fields.hasNext()) {
                Map.Entry<String, JsonNode> entry = fields.next();
                printJson(entry.getValue(), prefix + entry.getKey() + ": ");
            }
        } else if (node.isArray()) {
            for (JsonNode arrayElement : node) {
                printJson(arrayElement, prefix);
            }
        } else {
            System.out.println(prefix + node.asText());
        }
    }
}
