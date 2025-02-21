import java.util.Scanner;
public class ArrayOperationsExample {
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
System.out.println("Value at index " + index + ": " + array[index]);
} catch (ArrayIndexOutOfBoundsException e) {
System.out.println("Invalid index");
} catch (NullPointerException e) {
System.out.println("Array is not initialized");
} catch (Exception e) {
System.out.println("Please enter valid input.");
}
}
}
