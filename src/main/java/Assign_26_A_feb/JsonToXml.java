package Assign_26_A_feb;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.io.File;
public class JsonToXml {
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(new File("C:/Users/POOJA/Desktop/Capgemini_Training/src/main/java/Assign_26_A_feb/data.json"));

            XmlMapper xmlMapper = new XmlMapper();
            String xmlOutput = xmlMapper.writeValueAsString(jsonNode);

            System.out.println("Converted XML:");
            System.out.println(xmlOutput);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



