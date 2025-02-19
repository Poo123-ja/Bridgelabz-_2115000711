import java.util.*;
public class StackUsingQueues {
public static void main(String[] args) {
StackUsingQueues stack = new StackUsingQueues();
stack.push(1);
stack.push(2);
stack.push(3);
System.out.println("Popped: " + stack.pop());
}
private Queue<Integer> queue1;
private Queue<Integer> queue2;
public StackUsingQueues() {
queue1 = new LinkedList<>();
queue2 = new LinkedList<>();
}
public void push(int x) {
queue2.add(x);
while (!queue1.isEmpty()) {
queue2.add(queue1.poll());
}
Queue<Integer> temp = queue1;
queue1 = queue2;
queue2 = temp;
}
public int pop() {
if (queue1.isEmpty()) {
throw new RuntimeException("Stack is empty");
}
return queue1.poll();
}
public int top() {
if (queue1.isEmpty()) {
throw new RuntimeException("Stack is empty");
}
return queue1.peek();
}
}
