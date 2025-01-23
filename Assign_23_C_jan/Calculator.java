import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double first, second;
        String op;
        Scanner scanner = new Scanner(System.in);
        first = scanner.nextDouble();
        op = scanner.next();
        second = scanner.nextDouble();

        double result;
        switch (op) {
            case "+":
                result = first + second;
                System.out.println("Result: " + result);
                break;
            case "-":
                result = first - second;
                System.out.println("Result: " + result);
                break;
            case "*":
                result = first * second;
                System.out.println("Result: " + result);
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }
    }
}
