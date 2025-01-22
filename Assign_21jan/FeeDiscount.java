public class FeeDiscount {
    public static void main(String[] args) {

        int fee = 125000;
        int discountPercent = 10;

        double discount = (fee * discountPercent) / 100.0;
        double discountedFee = fee - discount;

        // Output the results
        System.out.println("The discount amount is INR " + discount 
                           + " and the final discounted fee is INR " + discountedFee);
    }
}
