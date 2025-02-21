import java.util.Scanner;
public class AgeValidation {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
try {
System.out.print("Enter your age: ");
int age = sc.nextInt();
validateAge(age);
} catch (InvalidAgeException e) {
System.out.println(e.getMessage());
} catch (Exception e) {
System.out.println("Invalid input. Please enter a valid age.");
}
}
public static void validateAge(int age) throws InvalidAgeException {
if (age < 18) {
throw new InvalidAgeException("Age must be 18 or above");
} else {
System.out.println("Access granted");
}
}
}
class InvalidAgeException extends Exception {
public InvalidAgeException(String message) {
super(message);
}
}
