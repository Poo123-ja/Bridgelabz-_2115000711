public class Student{
static String universityName="GLA University";
private String name;
private char grade;
final private int rollNumber;
static int totalStudents=0;
public Student(String name, int rollNumber,char grade){
this.name=name;
this.rollNumber=rollNumber;
this.grade=grade;
totalStudents++;
}
public void displayTotalStudents(){
System.out.println("Total number of students:"+totalStudents);
}
public void Display(){
System.out.println("University Name is:"+universityName);
System.out.println("Name of Student:"+name);
System.out.println("Rool Number of Student: "+rollNumber);
System.out.println("Grade is:"+grade);
}
public static void main(String [] args){
Student s=new Student("Pooja Singh",139,'O');
System.out.println(s instanceof Student);
s.displayTotalStudents();
s.Display();
}
}

