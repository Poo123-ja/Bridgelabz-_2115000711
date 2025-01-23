import java.util.Scanner;

public class RocketLaunchCountdown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the countdown start value: ");
        int counter = scanner.nextInt();
        for (int i = counter; i > 0; i--) {
            System.out.println("T-" + i + " seconds");
        }
        System.out.println("Launch!");
    }
}
