import java.util.ArrayList;
public class Main {
public static void main(String[] args) {
Professor professor1=new Professor("Dr. Praveen Mittal");
Professor professor2=new Professor("Dr. Sandeep Rathor");

Course course1=new Course("Mathematics");
Course course2=new Course("Physics");

course1.assignProfessor(professor1);
course2.assignProfessor(professor2);

Student student1=new Student("Pooja");
Student student2=new Student("khushi");

student1.enrollCourse(course1);
student1.enrollCourse(course2);
student2.enrollCourse(course1);

student1.viewEnrolledCourses();
student2.viewEnrolledCourses();

course1.viewCourseDetails();
course2.viewCourseDetails();
}
}

class Student {
String name;
ArrayList<Course> courses;

Student(String name) {
this.name=name;
this.courses=new ArrayList<>();
}

void enrollCourse(Course course) {
courses.add(course);
course.addStudent(this);
System.out.println(name+" enrolled in "+course.name);
}

void viewEnrolledCourses() {
System.out.println("Student:"+name+" is enrolled in:");
for(Course course:courses) {
System.out.println("-"+course.name);
}
}
}

class Professor {
String name;

Professor(String name) {
this.name=name;
}
}

class Course {
String name;
Professor professor;
ArrayList<Student> students;

Course(String name) {
this.name=name;
this.students=new ArrayList<>();
}

void assignProfessor(Professor professor) {
this.professor=professor;
System.out.println("Professor "+professor.name+" is assigned to "+name);
}

void addStudent(Student student) {
students.add(student);
}

void viewCourseDetails() {
System.out.println("Course:"+name);
if(professor!=null) {
System.out.println("Taught by:"+professor.name);
}
System.out.println("Enrolled Students:");
for(Student student:students) {
System.out.println("-"+student.name);
}
}
}
