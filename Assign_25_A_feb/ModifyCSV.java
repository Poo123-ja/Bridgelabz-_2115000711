import java.io.*;
import java.util.*;

public class UpdateEmployeeSalary {
public static void main(String[] args) {
String inputFilePath = "write.csv";
String outputFilePath = "updated.csv";
List<String[]> employeeData = new ArrayList<>();

try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath))) {
String line;
while ((line = br.readLine()) != null) {
String[] details = line.split(",");
if (details.length >= 3 && details[1].trim().equalsIgnoreCase("IT")) {
double salary = Double.parseDouble(details[2].trim());
salary *= 1.10;
details[2] = String.format("%.2f", salary);
}
employeeData.add(details);
}
} catch (IOException e) {
System.out.println("Error reading the file: " + e.getMessage());
return;
}

try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilePath))) {
for (String[] employee : employeeData) {
bw.write(String.join(",", employee));
bw.newLine();
}
System.out.println("Updated file saved as " + outputFilePath);
} catch (IOException e) {
System.out.println("Error writing the file: " + e.getMessage());
}
}
}
