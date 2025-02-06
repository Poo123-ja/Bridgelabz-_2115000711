import java.util.ArrayList;
public class Main {
public static void main(String[] args) {
University university=new University("Gla University");
Department dept1=new Department("Computer Science");
Department dept2=new Department("Mechanical Engineering");

Faculty faculty1=new Faculty("Dr. Praveen Mittal");
Faculty faculty2=new Faculty("Dr. Mayank srivastava");
Faculty faculty3=new Faculty("Dr. Sandeep Rathor");

university.addDepartment(dept1);
university.addDepartment(dept2);

university.addFaculty(faculty1);
university.addFaculty(faculty2);
university.addFaculty(faculty3);

university.showDetails();

university.shutdown();
}
}

class University {
String name;
ArrayList<Department> departments;
ArrayList<Faculty> faculties;

University(String name) {
this.name=name;
this.departments=new ArrayList<>();
this.faculties=new ArrayList<>();
}

void addDepartment(Department department) {
departments.add(department);
}

void addFaculty(Faculty faculty) {
faculties.add(faculty);
}

void showDetails() {
System.out.println("University:"+name);
System.out.println("Departments:");
for(Department dept:departments) {
System.out.println("-"+dept.name);
}
System.out.println("Faculty Members:");
for(Faculty faculty:faculties) {
System.out.println("-"+faculty.name);
}
}

void shutdown() {
System.out.println("Shutting down university:"+name);
departments.clear();
System.out.println("All departments have been deleted.");
}
}

class Department {
String name;

Department(String name) {
this.name=name;
}
}

class Faculty {
String name;

Faculty(String name) {
this.name=name;
}
}
