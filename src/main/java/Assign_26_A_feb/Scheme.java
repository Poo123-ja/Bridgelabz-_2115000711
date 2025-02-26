package Assign_26_A_feb;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonschema.core.report.ProcessingReport;
import com.github.fge.jsonschema.core.exceptions.ProcessingException;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import com.github.fge.jsonschema.main.JsonValidator;
import java.io.File;
import java.io.IOException;
public class Scheme {
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode schemaNode = objectMapper.readTree(new File("C:/Users/POOJA/Desktop/Capgemini_Training/src/main/java/Assign_26_A_feb/scheme.json"));
            JsonNode jsonData = objectMapper.readTree(new File("C:/Users/POOJA/Desktop/Capgemini_Training/src/main/java/Assign_26_A_feb/data.json"));

            JsonSchemaFactory factory = JsonSchemaFactory.byDefault();
            JsonSchema schema = factory.getJsonSchema(schemaNode);

            ProcessingReport report = schema.validate(jsonData);

            if (report.isSuccess()) {
                System.out.println("Valid JSON!");
            } else {
                System.out.println("Invalid JSON!");
                System.out.println(report);
            }
        } catch (IOException | ProcessingException e) {
            e.printStackTrace();
        }
    }

}


