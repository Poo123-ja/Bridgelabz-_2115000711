import java.util.Stack;
public class QueueUsingStacks {
private Stack<Integer> stack1;
private Stack<Integer> stack2;
public QueueUsingStacks() {
stack1 = new Stack<>();
stack2 = new Stack<>();
}
public void enqueue(int data) {
stack1.push(data);
}
public int dequeue() {
if (isEmpty()) {
System.out.println("Queue is empty");
return -1;
}
if (stack2.isEmpty()) {
while (!stack1.isEmpty()) {
stack2.push(stack1.pop());
}
}
return stack2.pop();
}
public int peek() {
if (isEmpty()) {
System.out.println("Queue is empty");
return -1;
}
if (stack2.isEmpty()) {
while (!stack1.isEmpty()) {
stack2.push(stack1.pop());
}
}
return stack2.peek();
}
public boolean isEmpty() {
return stack1.isEmpty() && stack2.isEmpty();
}
public static void main(String[] args) {
QueueUsingStacks queue = new QueueUsingStacks();
queue.enqueue(4);
queue.enqueue(5);
queue.enqueue(6);
System.out.println("Dequeued: " + queue.dequeue());
queue.enqueue(7);
System.out.println("Front element: " + queue.peek());
System.out.println("Dequeued: " + queue.dequeue());
System.out.println("Dequeued: " + queue.dequeue());
System.out.println("Dequeued: " + queue.dequeue());
System.out.println("Dequeued: " + queue.dequeue());
}
}

