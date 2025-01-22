import java.util.Scanner;

public class ChocolateDivider {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of chocolates: ");
        int numberOfChocolates = sc.nextInt();
        System.out.print("Enter the number of children: ");
        int numberOfChildren = sc.nextInt();
        if (numberOfChildren == 0) {
            System.out.println("Number of children cannot be zero.");
        } else{
            int chocolatesPerChild = numberOfChocolates / numberOfChildren;
            int remainingChocolates = numberOfChocolates % numberOfChildren;

            System.out.println("The number of chocolates each child gets is " + chocolatesPerChild);
            System.out.println("The number of remaining chocolates are " + remainingChocolates);
        }

        }
    }

