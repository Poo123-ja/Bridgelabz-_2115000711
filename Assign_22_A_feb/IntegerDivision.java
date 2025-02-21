import java.util.Scanner;
public class IntegerDivision {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
try {
System.out.print("Enter numerator: ");
int a = sc.nextInt();
System.out.print("Enter denominator: ");
int b = sc.nextInt();
int c = a / b;
System.out.println("Result: " + c);
} catch (ArithmeticException e) {
System.out.println(" Division by zero is not allowed.");
} catch (Exception e) {
System.out.println("Please enter valid integers.");
}
}
}
