import java.util.ArrayList;
public class Main {
public static void main(String[] args) {
Company company = new Company("TechCorp");
Department dept1 = new Department("Engineering");
Department dept2 = new Department("HR");
dept1.addEmployee("pooja");
dept1.addEmployee("Praveen");
dept2.addEmployee("Aniket");
company.addDepartment(dept1);
company.addDepartment(dept2);
company.showCompanyDetails();
company.shutdown();
}
}
class Company {
String name;
ArrayList<Department> departments;
Company(String name) {
this.name = name;
this.departments = new ArrayList<>();
}
void addDepartment(Department department) {
departments.add(department);
}
void showCompanyDetails() {
System.out.println("Company: " + name);
for (Department dept : departments) {
dept.showDepartmentDetails();
}
}
void shutdown() {
System.out.println("Shutting down company: " + name);
for (Department dept : departments) {
dept.shutdown();
}
departments.clear();
}
}
class Department {
String name;
ArrayList<Employee> employees;
Department(String name) {
this.name = name;
this.employees = new ArrayList<>();
}
void addEmployee(String employeeName) {
employees.add(new Employee(employeeName));
}
void showDepartmentDetails() {
System.out.println("Department: " + name);
for (Employee emp : employees) {
emp.showEmployeeDetails();
}
}

void shutdown() {
System.out.println("Deleting department: " + name);
employees.clear();
}
}

class Employee {
String name;

Employee(String name) {
this.name = name;
}

void showEmployeeDetails() {
System.out.println("Employee: " + name);
}
}
