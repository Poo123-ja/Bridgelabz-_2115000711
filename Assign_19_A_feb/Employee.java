import java.util.*; 
import java.util.stream.Collectors; 
public class GroupEmployee { 
public static void main(String[] args) { 
List<Employee> employees = Arrays.asList( 
new Employee("Alice", "HR"), 
new Employee("Bob", "IT"), 
new Employee("Carol", "HR") 
); 
Map<String, List<Employee>> groupedByDepartment = employees.stream() 
.collect(Collectors.groupingBy(e -> e.department)); 
groupedByDepartment.forEach((dept, empList) -> 
System.out.println(dept + ": " + empList)); 
} 
} 

class Employee { 
String name; 
String department; 
public Employee(String name, String department) { 
this.name = name; 
this.department = department; 
} 
@Override 
public String toString() { 
return name; 
} 
}

