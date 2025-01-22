public class ProfitLoss{
	 public static void main(String []args){
              int costPrice = 129;
              int sellingPrice = 191;

        // Calculate profit and profit percentage
        	int profit = sellingPrice - costPrice;
        	double profitPercentage = (profit / (double) costPrice) * 100;

        // Display the output using a single print statement
        System.out.println(String.format(
            "The Cost Price is INR %d and Selling Price is INR %d\n" +
            "The Profit is INR %d and the Profit Percentage is %.2f%%",
            costPrice, sellingPrice, profit, profitPercentage
        ));
    }
}
		
