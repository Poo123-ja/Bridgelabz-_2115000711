import java.util.Scanner;
public class StudentRecordManagement {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
StudentList list = new StudentList();
while (true) {
System.out.println("1. Add at Beginning 2. Add at End 3. Add at Position 4. Delete by Roll Number 5. Search 6. Display All 7. Update Grade 8. Exit");
int choice = sc.nextInt();
if (choice == 1) {
System.out.println("Enter Roll Number, Name, Age, Grade:");
list.addAtBeginning(sc.nextInt(), sc.next(), sc.nextInt(), sc.next().charAt(0));
}
if (choice == 2) {
System.out.println("Enter Roll Number, Name, Age, Grade:");
list.addAtEnd(sc.nextInt(), sc.next(), sc.nextInt(), sc.next().charAt(0));
}
if (choice == 3) {
System.out.println("Enter Roll Number, Name, Age, Grade, Position:");
list.addAtPosition(sc.nextInt(), sc.next(), sc.nextInt(), sc.next().charAt(0), sc.nextInt());
}
if (choice == 4) {
System.out.println("Enter Roll Number:");
list.deleteByRollNumber(sc.nextInt());
}
if (choice == 5) {
System.out.println("Enter Roll Number:");
list.searchByRollNumber(sc.nextInt());
}
if (choice == 6) {
list.displayAll();
}
if (choice == 7) {
System.out.println("Enter Roll Number and New Grade:");
list.updateGrade(sc.nextInt(), sc.next().charAt(0));
}
if (choice == 8) {
break;
}
}
}
}
class Student {
int rollNumber;
String name;
int age;
char grade;
Student next;
Student(int rollNumber, String name, int age, char grade) {
this.rollNumber = rollNumber;
this.name = name;
this.age = age;
this.grade = grade;
this.next = null;
}
}
// Add at beginning.
class StudentList {
Student head;
void addAtBeginning(int rollNumber, String name, int age, char grade) {
Student newStudent = new Student(rollNumber, name, age, grade);
newStudent.next = head;
head = newStudent;
}
// add at end.
void addAtEnd(int rollNumber, String name, int age, char grade) {
Student newStudent = new Student(rollNumber, name, age, grade);
if (head == null) {
head = newStudent;
return;
}
Student temp = head;
while (temp.next != null) temp = temp.next;
temp.next = newStudent;
}
// at position.
void addAtPosition(int rollNumber, String name, int age, char grade, int position) {
Student newStudent = new Student(rollNumber, name, age, grade);
if (position == 1) {
newStudent.next = head;
head = newStudent;
return;
}
Student temp = head;
for (int i = 1; temp != null && i < position - 1; i++) temp = temp.next;
if (temp == null) return;
newStudent.next = temp.next;
temp.next = newStudent;
}
// delete by rollnumber.
void deleteByRollNumber(int rollNumber) {
if (head == null) return;
if (head.rollNumber == rollNumber) {
head = head.next;
return;
}
Student temp = head, prev = null;
while (temp != null && temp.rollNumber != rollNumber) {
prev = temp;
temp = temp.next;
}
if (temp == null) return;
prev.next = temp.next;
}
//search by roll number.
void searchByRollNumber(int rollNumber) {
Student temp = head;
while (temp != null) {
if (temp.rollNumber == rollNumber) {
System.out.println("Roll Number: " + temp.rollNumber + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
return;
}
temp = temp.next;
}
System.out.println("Student not found.");
}
void displayAll() {
Student temp = head;
while (temp != null) {
System.out.println("Roll Number: " + temp.rollNumber + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
temp = temp.next;
}
}
// update grade
void updateGrade(int rollNumber, char newGrade) {
Student temp = head;
while (temp != null) {
if (temp.rollNumber == rollNumber) {
temp.grade = newGrade;
return;
}
temp = temp.next;
}
}
}

