import java.util.Scanner;

public class SquareSideCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = sc.nextDouble();
        double side = perimeter / 4;

        // Output the result
        System.out.printf("The length of the side is %.2f whose perimeter is %.2f.%n", side, perimeter);

        // Close the scanner
        sc.close();
    }
}
