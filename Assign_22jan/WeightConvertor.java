import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the weight in pounds: ");
        double weightInPounds = sc.nextDouble();

        // Convert pounds to kilograms
        double weightInKilograms = weightInPounds / 2.2;
	System.out.println("The weight of the person in pound is" + weightInPounds +  "and in kg is" + weightInPounds );

    }
}
