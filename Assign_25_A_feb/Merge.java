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

public class Merge {
public static void main(String[] args) {
String file1 = "student1.csv";
String file2 = "student2.csv";
String outputFile = "merged_students.csv";
Map<Integer, Student> studentMap = new HashMap<>();

try (BufferedReader br = new BufferedReader(new FileReader(file1))) {
String line;
boolean firstLine = true;
while ((line = br.readLine()) != null) {
if (firstLine) { firstLine = false; continue; }
String[] details = line.split(",");
if (details.length == 3) {
int id = Integer.parseInt(details[0].trim());
String name = details[1].trim();
int age = Integer.parseInt(details[2].trim());
studentMap.put(id, new Student(id, name, age, 0, ""));
}
}
} catch (IOException e) {
System.out.println("Error reading file1: " + e.getMessage());
}

try (BufferedReader br = new BufferedReader(new FileReader(file2))) {
String line;
boolean firstLine = true;
while ((line = br.readLine()) != null) {
if (firstLine) { firstLine = false; continue; }
String[] details = line.split(",");
if (details.length == 3) {
int id = Integer.parseInt(details[0].trim());
int marks = Integer.parseInt(details[1].trim());
String grade = details[2].trim();
if (studentMap.containsKey(id)) {
Student student = studentMap.get(id);
student.setMarks(marks);
student.setGrade(grade);
}
}
}
} catch (IOException e) {
System.out.println("Error reading file2: " + e.getMessage());
}

try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
bw.write("ID,Name,Age,Marks,Grade\n");
for (Student student : studentMap.values()) {
bw.write(student.getId() + "," + student.getName() + "," + student.getAge() + "," + student.getMarks() + "," + student.getGrade() + "\n");
}
System.out.println("Merged file saved as " + outputFile);
} catch (IOException e) {
System.out.println("Error writing merged file: " + e.getMessage());
}
}
}
