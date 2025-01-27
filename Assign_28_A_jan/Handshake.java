import java.util.Scanner;
public class Handshake{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of student:");
int numberOfStudents=sc.nextInt();
CalculateHandshakes(numberOfStudents);
}
public static void CalculateHandshakes(int numberOfStudents){
double totalHandshakes= (numberOfStudents * (numberOfStudents - 1)) / 2 ;
System.out.print("Total possible handshakes is "+totalHandshakes);
}
}
