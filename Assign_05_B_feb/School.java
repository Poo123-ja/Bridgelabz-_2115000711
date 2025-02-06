import java.util.ArrayList;
public class Main {
public static void main(String[] args) {
School school=new School("Seemax International");
Student student1=new Student("Pooja");
Student student2=new Student("Ritu");
Course course1=new Course("Mathematics");
Course course2=new Course("Physics");

student1.enrollInCourse(course1);
student1.enrollInCourse(course2);
student2.enrollInCourse(course1);

school.addStudent(student1);
school.addStudent(student2);

student1.viewEnrolledCourses();
student2.viewEnrolledCourses();

course1.viewEnrolledStudents();
course2.viewEnrolledStudents();
}
}

class School {
String name;
ArrayList<Student> students;

School(String name) {
this.name=name;
this.students=new ArrayList<>();
}

void addStudent(Student student) {
students.add(student);
}
}

class Student {
String name;
ArrayList<Course> courses;

Student(String name) {
this.name=name;
this.courses=new ArrayList<>();
}

void enrollInCourse(Course course) {
courses.add(course);
course.addStudent(this);
}

void viewEnrolledCourses() {
System.out.println("Student:"+name+" is enrolled in:");
for(Course course:courses) {
System.out.println("-"+course.name);
}
}
}

class Course {
String name;
ArrayList<Student> students;

Course(String name) {
this.name=name;
this.students=new ArrayList<>();
}

void addStudent(Student student) {
students.add(student);
}

void viewEnrolledStudents() {
System.out.println("Course:"+name+" has the following students:");
for(Student student:students) {
System.out.println("-"+student.name);
}
}
}











