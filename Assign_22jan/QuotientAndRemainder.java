import java.util.Scanner;
public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number (dividend): ");
        int number1 = sc.nextInt();
        System.out.print("Enter the second number (divisor): ");
        int number2 = sc.nextInt();
        if (number2 == 0) {
            System.out.println("Division by zero is not allowed.");
        } else {
            // Calculating quotient and remainder
            int quotient = number1 / number2;
            int remainder = number1 % number2;
            // Printing the result
            System.out.printf("The Quotient is %d and Reminder is %d of two numbers %d and %d.\n",
                    quotient, remainder, number1, number2);
        }

    }
}

