import java.util.*;
class Employee{
String name="";
int salary=0;
String id="";
public Employee(String name,String id,int salary){
this.name=name;
this.id=id;
this.salary=salary;
}
public void displayDetails(){
System.out.println("Employee name: "+name);
System.out.println("Employee id: "+id);
System.out.println("Employee salary:"+salary);
}
public static void main(String []args){
Employee emp=new Employee("Pooja","1628",1500000);
emp.displayDetails();
}
}
