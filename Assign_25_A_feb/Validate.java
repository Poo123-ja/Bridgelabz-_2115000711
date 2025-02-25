import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Validate{
public static void main(String[] args) {
String inputFilePath = "employees.csv";
List<String[]> employeeData = new ArrayList<>();
Pattern emailPattern = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
Pattern phonePattern = Pattern.compile("^\\d{10}$");

try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath))) {
String line;
while ((line = br.readLine()) != null) {
String[] details = line.split(",");
if (details.length >= 5) {
String email = details[3].trim();
String phone = details[4].trim();
if (!emailPattern.matcher(email).matches()) {
System.out.println("Invalid email format: " + line);
continue;
}
if (!phonePattern.matcher(phone).matches()) {
System.out.println("Invalid phone number: " + line);
continue;
}
employeeData.add(details);
} else {
System.out.println("Invalid row format: " + line);
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
