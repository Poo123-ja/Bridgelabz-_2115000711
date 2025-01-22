import java.util.Scanner;

class DistanceConverter {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);   
     System.out.print("Enter the distance in feet: ");
        double distanceInFeet = sc.nextDouble();
        double distanceInYards = distanceInFeet / 3; // 1 yard = 3 feet
        double distanceInMiles = distanceInYards / 1760; // 1 mile = 1760 yards

        // Output the results
        System.out.printf("The distance is %.2f yards or %.4f miles for %.2f feet.%n", 
                          distanceInYards, distanceInMiles, distanceInFeet);

      
        sc.close();
    }
}
