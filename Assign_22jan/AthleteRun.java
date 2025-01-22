import java.util.Scanner;

public class AthleteRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the sides of the triangle
        System.out.print("Enter the length of side1 in meters: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of side2 in meters: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of side3 in meters: ");
        double side3 = scanner.nextDouble();

        // Calculating the perimeter of the triangle
        double perimeter = side1 + side2 + side3;

        // Total distance to run is 5 kilometers = 5000 meters
        double totalDistance = 5000;
        double rounds = totalDistance / perimeter;
        System.out.printf("The total number of rounds the athlete will run is "+ rounds + "to complete 5 km");

        
    }
}
