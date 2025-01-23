import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amar's age and height (in cm): ");
        int ageAmar = sc.nextInt(), heightAmar = sc.nextInt();
        System.out.print("Enter Akbar's age and height (in cm): ");
        int ageAkbar = sc.nextInt(), heightAkbar = sc.nextInt();
        System.out.print("Enter Anthony's age and height (in cm): ");
        int ageAnthony = sc.nextInt(), heightAnthony = sc.nextInt();

        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        String youngest = (youngestAge == ageAmar) ? "Amar" : (youngestAge == ageAkbar) ? "Akbar" : "Anthony";

        int tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String tallest = (tallestHeight == heightAmar) ? "Amar" : (tallestHeight == heightAkbar) ? "Akbar" : "Anthony";

        System.out.println("The youngest friend is " + youngest + " (Age: " + youngestAge + ")");
        System.out.println("The tallest friend is " + tallest + " (Height: " + tallestHeight + " cm)");

    }
}
