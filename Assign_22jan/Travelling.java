import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the starting city (fromCity): ");
        String fromCity = scanner.nextLine();

        System.out.print("Enter the city you travel via (viaCity): ");
        String viaCity = scanner.nextLine();

        System.out.print("Enter the destination city (toCity): ");
        String toCity = scanner.nextLine();

 
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in miles: ");
        double fromToVia = scanner.nextDouble();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in miles: ");
        double viaToFinalCity = scanner.nextDouble();

        
        System.out.print("Enter the total time taken for the journey in hours: ");
        double totalTime = scanner.nextDouble();

        // Calculating total distance and average speed
        double totalDistance = fromToVia + viaToFinalCity;
        double averageSpeed = totalDistance / totalTime;

        // Printing the result
        System.out.printf("\nHello %s!\n", name);
        System.out.printf("Your travel details are:\n");
        System.out.printf("From %s to %s via %s.\n", fromCity, toCity, viaCity);
        System.out.printf("Total distance traveled: %.2f miles.\n", totalDistance);
        System.out.printf("Total time taken: %.2f hours.\n", totalTime);
        System.out.printf("Average speed: %.2f miles/hour.\n", averageSpeed);

       
    }
}
