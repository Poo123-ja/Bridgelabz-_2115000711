import java.util.Scanner;
import java.util.InputMismatchException;
public class UncheckedException{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
try{
System.out.println("Enter first number");
int a=sc.nextInt();
System.out.println("Enter second number");
int b=sc.nextInt();
int c=a/b;
System.out.println("Result"+c);
}
catch(ArithmeticException e){
System.out.println("division by zero is not allowed");
}
catch(InputMismatchException e){
System.out.println("enter valid value");
}
}
}

