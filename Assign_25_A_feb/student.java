import java.io.*;
import java.util.*;

class Student {
private String name;
private String department;
private double salary;
private String email;
private String phone;

public Student(String name, String department, double salary, String email, String phone) {
this.name = name;
this.department = department;
this.salary = salary;
this.email = email;
this.phone = phone;
}

@Override
public String toString() {
return "Student{name='" + name + "', department='" + department + "', salary=" + salary + ", email='" + email + "', phone='" + phone + "'}";
}
}

public class CsvToStudent {
public static void main(String[] args) {
String filePath = "employees.csv";
List<Student> students = new ArrayList<>();

try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
String line;
while ((line = br.readLine()) != null) {
String[] details = line.split(",");
if (details.length == 5) {
students.add(new Student(details[0].trim(), details[1].trim(), Double.parseDouble(details[2].trim()), details[3].trim(), details[4].trim()));
}
}
} catch (IOException e) {
System.out.println("Error reading the file: " + e.getMessage());
}

students.forEach(System.out::println);
}
}
