import java.util.Stack;
public class SortStackUsingRecursion {
public static void sortStack(Stack<Integer> stack) {
if (!stack.isEmpty()) {
int top = stack.pop();
sortStack(stack);
insertInSortedOrder(stack, top);
}
}
private static void insertInSortedOrder(Stack<Integer> stack, int element) {
if (stack.isEmpty() || stack.peek() <= element) {
stack.push(element);
} else {
int top = stack.pop();
insertInSortedOrder(stack, element);
stack.push(top);
}
}
public static void main(String[] args) {
Stack<Integer> stack = new Stack<>();
stack.push(12);
stack.push(10);
stack.push(1);
stack.push(20);
System.out.println("Original stack: " + stack);
sortStack(stack);
System.out.println("Sorted stack: " + stack);
}
}

