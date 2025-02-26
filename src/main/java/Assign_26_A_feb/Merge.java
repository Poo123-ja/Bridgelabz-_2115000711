package Assign_26_A_feb;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Merge {
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();

            // Define two JSON objects as Strings
            String json1 = "{ \"name\": \"pooja\", \"email\": \"poojasingh@gmail.com\" }";
            String json2 = "{ \"age\": 20, \"city\": \"Hathras\" }";

            // Convert JSON strings to JsonNode
            JsonNode node1 = objectMapper.readTree(json1);
            JsonNode node2 = objectMapper.readTree(json2);

            // Merge the JSON objects
            ObjectNode mergedNode = objectMapper.createObjectNode();
            mergedNode.setAll((ObjectNode) node1);
            mergedNode.setAll((ObjectNode) node2);

            // Convert merged JSON to String
            String mergedJson = objectMapper.writeValueAsString(mergedNode);

            System.out.println("Merged JSON: " + mergedJson);
        }catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

    }
}

