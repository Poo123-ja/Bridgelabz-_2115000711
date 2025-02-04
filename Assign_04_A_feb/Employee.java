public  class Employee{
static String companyName="Amazon";
private String name;
private String designation;
final private String id="123456";
static int totalEmployee=0;
public Employee(String name, String designation){
this.name=name;
this.designation=designation;
totalEmployee++;
}
static void displayTotalEmployee(){
System.out.println("Total Number of employees are :"+totalEmployee);
}
public void Display(){
System.out.println("Name of Employee:"+name);
System.out.println("ID of Employee:"+id);
System.out.println("Designation:"+designation);
}
public static void main(String []args){
Employee e=new Employee("pooja singh","software engineer");
e.displayTotalEmployee();
e.Display();
System.out.println( e instanceof Employee);
}
}
