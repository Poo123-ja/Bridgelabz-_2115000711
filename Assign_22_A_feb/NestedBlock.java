import java.util.Scanner;
public class Nested{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
try {
System.out.print("Enter the size of the array: ");
int size = sc.nextInt();
int[] array = new int[size];
System.out.println("Enter " + size + " elements:");
for (int i = 0; i < size; i++) {
array[i] = sc.nextInt();
}
System.out.print("Enter index to retrieve value: ");
int index = sc.nextInt();
try {
System.out.print("Enter divisor: ");
int divisor = sc.nextInt();
int result = array[index] / divisor;
System.out.println("Result: " + result);
} catch (ArithmeticException e) {
System.out.println("Cannot divide by zero!");
}
} catch (ArrayIndexOutOfBoundsException e) {
System.out.println("Invalid array index");
} catch (Exception e) {
System.out.println("Please enter valid values.");
}
}
}
