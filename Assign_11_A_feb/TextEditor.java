class TextEditor {
private class Node {
String text;
Node prev, next;
Node(String text) {
this.text = text;
}
}
private Node head, tail, current;
private int size, capacity;
public TextEditor(int capacity) {
this.capacity = capacity;
this.size = 0;
this.head = this.tail = this.current = null;
}
public void addState(String text) {
Node newNode = new Node(text);
if (current != null) {
current.next = newNode;
newNode.prev = current;
}
current = newNode;
if (head == null) head = newNode;
tail = newNode;
if (size == capacity) {
head = head.next;
if (head != null) head.prev = null;
} else {
size++;
}
}
public void undo() {
if (current != null && current.prev != null) {
current = current.prev;
}
}
public void redo() {
if (current != null && current.next != null) {
current = current.next;
}
}
public String getCurrentState() {
return current != null ? current.text : "";
}
public static void main(String[] args) {
TextEditor editor = new TextEditor(10);
editor.addState("Hello");
editor.addState("Hello, khushi");
editor.addState("Hello, khushi");
System.out.println("Current: " + editor.getCurrentState());
editor.undo();
System.out.println("After Undo: " + editor.getCurrentState()); 
editor.redo();
System.out.println("After Redo: " + editor.getCurrentState());
}
}
