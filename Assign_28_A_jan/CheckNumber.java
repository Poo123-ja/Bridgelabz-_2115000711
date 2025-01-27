import java.util.Scanner;
public class CheckNumber{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int number=sc.nextInt();
check(number);
}
public static void check(int number){
if(number>0)
System.out.println(number+" is positive.");
else if(number ==0)
System.out.println(number+" is zero.");
else
System.out.println(number+" is negative.");
}
}
