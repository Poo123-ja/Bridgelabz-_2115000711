import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class EmployeeSerialization {
public static void main(String[] args) {
List<Employee> employeeList = new ArrayList<>();
employeeList.add(new Employee(1, "pooja", "Engineering", 75000));
employeeList.add(new Employee(2, "khushi", "HR", 60000));
employeeList.add(new Employee(3, "krishna", "Sales", 70000));
String filePath ="employees.dat";
try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
oos.writeObject(employeeList);
System.out.println("Employees serialized successfully.");
} catch (IOException e) {
System.out.println("Error serializing employees: " + e.getMessage());
}
try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
@SuppressWarnings("unchecked")
List<Employee> deserializedEmployees = (List<Employee>) ois.readObject();
System.out.println("Deserialized Employees:");
for (Employee emp : deserializedEmployees) {
System.out.println(emp);
}
} catch (IOException | ClassNotFoundException e) {
System.out.println("Error deserializing employees: " + e.getMessage());
}
}
}

class Employee implements Serializable {
private static final long serialVersionUID = 1L;
private int id;
private String name;
private String department;
private double salary;
public Employee(int id, String name, String department, double salary) {
this.id = id;
this.name = name;
this.department = department;
this.salary = salary;
}
@Override
public String toString() {
return "Employee [ID=" + id + ", Name=" + name + ", Department=" + department + ", Salary=" + salary + "]";
}
}
