import java.io.*;
import java.util.*;

public class SortEmployeesBySalary {
public static void main(String[] args) {
String path = "employees.csv";
List<String[]> employeeData = new ArrayList<>();

try (BufferedReader br = new BufferedReader(new FileReader(path))) {
String line;
while ((line = br.readLine()) != null) {
String[] details = line.split(",");
if (details.length >= 3) {
employeeData.add(details);
}
}
} catch (IOException e) {
System.out.println("Error reading the file: " + e.getMessage());
return;
}

employeeData.sort((a, b) -> Double.compare(Double.parseDouble(b[2].trim()), Double.parseDouble(a[2].trim())));

System.out.println("Top 5 highest-paid employees:");
for (int i = 0; i < Math.min(5, employeeData.size()); i++) {
System.out.println(Arrays.toString(employeeData.get(i)));
}
}
}
