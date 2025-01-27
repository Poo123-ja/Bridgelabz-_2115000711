import java.util.Scanner;
public class Chocolate {
public static int[] findRemainderAndQuotient(int number, int divisor) {
int[] result = new int[2];
result[0] = number / divisor; // Quotient
result[1] = number % divisor; // Remainder
return result;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the total number of chocolates: ");
int numberOfChocolates = sc.nextInt();
System.out.print("Enter the number of children: ");
int numberOfChildren = sc.nextInt();
if (numberOfChildren == 0) {
System.out.println("Error: Number of children cannot be zero.");
return;
}
int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
System.out.println("Each child gets: " + result[0] + " chocolates.");
System.out.println("Remaining chocolates: " + result[1]);
}
}






