import java.util.Stack;
public class StockSpanProblem {
public static void main(String[] args) {
int[] prices = {120, 100, 80, 70, 90, 85, 65};
int[] span = calculateSpan(prices);
System.out.println("Stock prices:");
for (int price : prices) {
System.out.print(price + " ");
}
System.out.println("\nStock span:");
for (int s : span) {
System.out.print(s + " ");
}
}

public static int[] calculateSpan(int[] prices) {
int n = prices.length;
int[] span = new int[n];
Stack<Integer> stack = new Stack<>();
for (int i = 0; i < n; i++) {
while (!stack.isEmpty() && prices[i] >= prices[stack.peek()]) {
stack.pop();
}
if (stack.isEmpty()) {
span[i] = i + 1;
} else {
span[i] = i - stack.peek();
}
stack.push(i);
}
return span;
}
}
