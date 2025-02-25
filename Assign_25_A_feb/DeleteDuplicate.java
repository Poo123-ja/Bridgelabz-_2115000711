import java.io.*;
import java.util.*;

class Student {
private int id;
private String name;
private int age;
private int marks;
private String grade;

public Student(int id, String name, int age, int marks, String grade) {
this.id = id;
this.name = name;
this.age = age;
this.marks = marks;
this.grade = grade;
}

public int getId() { return id; }
public String getName() { return name; }
public int getAge() { return age; }
public int getMarks() { return marks; }
public String getGrade() { return grade; }

public void setMarks(int marks) { this.marks = marks; }
public void setGrade(String grade) { this.grade = grade; }

@Override
public String toString() {
return "Student{id=" + id + ", name='" + name + "', age=" + age + ", marks=" + marks + ", grade='" + grade + "'}";
}
}

public class DeleteDuplicate {
public static void main(String[] args) {
String largeFile = "employees.csv";
int batchSize = 100;
int totalRecords = 0;
Set<Integer> uniqueIds = new HashSet<>();
List<String> duplicateRecords = new ArrayList<>();

try (BufferedReader br = new BufferedReader(new FileReader(largeFile))) {
String line;
boolean firstLine = true;
List<String> batch = new ArrayList<>();

while ((line = br.readLine()) != null) {
if (firstLine) { firstLine = false; continue; }
batch.add(line);
totalRecords++;

if (batch.size() == batchSize) {
processBatch(batch, uniqueIds, duplicateRecords);
batch.clear();
System.out.println("Processed: " + totalRecords + " records");
}
}

if (!batch.isEmpty()) {
processBatch(batch, uniqueIds, duplicateRecords);
System.out.println("Processed: " + totalRecords + " records");
}

System.out.println("Duplicate Records Found:");
for (String record : duplicateRecords) {
System.out.println(record);
}

} catch (IOException e) {
System.out.println("Error reading file: " + e.getMessage());
}
}

private static void processBatch(List<String> batch, Set<Integer> uniqueIds, List<String> duplicateRecords) {
for (String record : batch) {
String[] details = record.split(",");
if (details.length == 5) {
try {
int id = Integer.parseInt(details[0].trim());
if (!uniqueIds.add(id)) {
duplicateRecords.add(record);
continue;
}
String name = details[1].trim();
int age = Integer.parseInt(details[2].trim());
int marks = Integer.parseInt(details[3].trim());
String grade = details[4].trim();
Student student = new Student(id, name, age, marks, grade);
System.out.println(student);
} catch (NumberFormatException e) {
System.out.println("Skipping invalid row: " + Arrays.toString(details));
}
} else {
System.out.println("Skipping malformed row: " + record);
}
}
}
}
