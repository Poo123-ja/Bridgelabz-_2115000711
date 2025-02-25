import java.nio.file.*;
import java.io.IOException;
import java.util.List;

public class FilterRecord {
public static void main(String[] args) throws IOException {
String filePath = "student.csv"; 
List<String> lines = Files.readAllLines(Paths.get(filePath));
System.out.println("Students scoring more than 80 marks:");
for (int i = 1; i < lines.size(); i++) {
String[] parts = lines.get(i).split(","); 
String name = parts[0].trim();
int marks = Integer.parseInt(parts[1].trim());

if (marks > 80) {
System.out.println(name + " - " + marks);
}
}
}
}
