import java.util.*;
public class EmployeeManagement {
public static void main(String[] args) {
List<Employee> employees = new ArrayList<>();
FullTimeEmployee ftEmployee = new FullTimeEmployee(1, "Khushi", 50000, 20000);
PartTimeEmployee ptEmployee = new PartTimeEmployee(2, "Aman", 30000, 20, 100);
employees.add(ftEmployee);
employees.add(ptEmployee);

for (Employee emp : employees) {
emp.displayDetails();
System.out.println("Calculated Salary: " + emp.calculateSalary());
System.out.println("-------------------------");
}
}
}

abstract class Employee {
private int employeeId;
private String name;
private double baseSalary;

public Employee(int employeeId, String name, double baseSalary) {
this.employeeId = employeeId;
this.name = name;
this.baseSalary = baseSalary;
}

public int getEmployeeId() {
return employeeId;
}

public void setEmployeeId(int employeeId) {
this.employeeId = employeeId;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public double getBaseSalary() {
return baseSalary;
}

public void setBaseSalary(double baseSalary) {
this.baseSalary = baseSalary;
}

public abstract double calculateSalary();

public void displayDetails() {
System.out.println("Employee ID: " + employeeId);
System.out.println("Name: " + name);
System.out.println("Base Salary: " + baseSalary);
}
}

class FullTimeEmployee extends Employee {
private double fixedSalary;

public FullTimeEmployee(int employeeId, String name, double baseSalary, double fixedSalary) {
super(employeeId, name, baseSalary);
this.fixedSalary = fixedSalary;
}

public double getFixedSalary() {
return fixedSalary;
}

public void setFixedSalary(double fixedSalary) {
this.fixedSalary = fixedSalary;
}

@Override
public double calculateSalary() {
return getBaseSalary() + fixedSalary;
}
}

class PartTimeEmployee extends Employee {
private int hoursWorked;
private double hourlyRate;

public PartTimeEmployee(int employeeId, String name, double baseSalary, int hoursWorked, double hourlyRate) {
super(employeeId, name, baseSalary);
this.hoursWorked = hoursWorked;
this.hourlyRate = hourlyRate;
}

public int getHoursWorked() {
return hoursWorked;
}

public void setHoursWorked(int hoursWorked) {
this.hoursWorked = hoursWorked;
}

public double getHourlyRate() {
return hourlyRate;
}

public void setHourlyRate(double hourlyRate) {
this.hourlyRate = hourlyRate;
}

@Override
public double calculateSalary() {
return getBaseSalary() + (hoursWorked * hourlyRate);
}
}

interface Department {
void assignDepartment(String departmentName);
String getDepartmentDetails();
}











