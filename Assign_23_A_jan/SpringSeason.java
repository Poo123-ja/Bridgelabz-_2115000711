public class SpringSeason {
    public static void main(String[] args) {
        // Check if two arguments are provided
        if (args.length < 2) {
            System.out.println("Please provide both month and day as command-line arguments.");
            return;
        }

        // Parse the command-line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Determine if it's spring season
        boolean isSpring = false;

        if (month == 3 && day >= 20 && day <= 31) {
            isSpring = true; // March 20 to March 31
        } else if (month == 4 && day >= 1 && day <= 30) {
            isSpring = true; // April 1 to April 30
        } else if (month == 5 && day >= 1 && day <= 31) {
            isSpring = true; // May 1 to May 31
        } else if (month == 6 && day >= 1 && day <= 20) {
            isSpring = true; // June 1 to June 20
        }
        if (isSpring) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
    }
}
