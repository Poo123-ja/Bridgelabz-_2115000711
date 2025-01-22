import java.util.Scanner;

class TriangleToCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the triangle (in inches): ");
        double baseInInches = scanner.nextDouble();
        System.out.print("Enter the height of the triangle (in inches): ");
        double heightInInches = scanner.nextDouble();
        //  Area Calculation.
        double areaInSquareInches = 0.5 * baseInInches * heightInInches;
        // Conversion factors
        final double INCH_TO_CM = 2.54;
        double baseInCm = baseInInches * INCH_TO_CM;
        double heightInCm = heightInInches * INCH_TO_CM;
        double areaInSquareCm = 0.5 * baseInCm * heightInCm;

        // Height conversions
        double heightInFeet = heightInInches / 12.0;

        // Output results
        System.out.printf("Area of the triangle: %.2f square inches or %.2f square centimeters.%n", 
                           areaInSquareInches, areaInSquareCm);

        scanner.close();
    }
}
