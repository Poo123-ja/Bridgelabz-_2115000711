import java.util.*;
public class QuickSortPrices {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of products: ");
int n = sc.nextInt();
double[] prices = new double[n];
System.out.println("Enter the prices of the products:");
for (int i = 0; i < n; i++) {
prices[i] = sc.nextDouble();
}

System.out.println("Original prices: " + Arrays.toString(prices));
quickSort(prices, 0, prices.length - 1);
System.out.println("Sorted prices: " + Arrays.toString(prices));

scanner.close();
}

public static void quickSort(double[] prices, int low, int high) {
if (low < high) {
int pivotIndex = partition(prices, low, high);
quickSort(prices, low, pivotIndex - 1);
quickSort(prices, pivotIndex + 1, high);
}
}

private static int partition(double[] prices, int low, int high) {
double pivot = prices[high];
int i = low - 1;
for (int j = low; j < high; j++) {
if (prices[j] < pivot) {
i++;
swap(prices, i, j);
}
}
swap(prices, i + 1, high);
return i + 1;
}

private static void swap(double[] prices, int i, int j) {
double temp = prices[i];
prices[i] = prices[j];
prices[j] = temp;
}
}
