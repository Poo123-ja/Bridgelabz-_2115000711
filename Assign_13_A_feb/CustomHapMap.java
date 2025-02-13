import java.util.*;
public class CustomHashMap {
public static void main(String[] args) {
CustomHashMap customMap = new CustomHashMap();
customMap.put(1, 100);
customMap.put(2, 200);
customMap.put(3, 300);
System.out.println("Value for key 1: " + customMap.get(1));
System.out.println("Value for key 2: " + customMap.get(2));
System.out.println("Value for key 3: " + customMap.get(3));
customMap.remove(2);
System.out.println("Value for key 2 after removal: " + customMap.get(2));
}
public static final int SIZE = 16;
private LinkedList<Node>[] map;
private class Node {
int key;
int value;
Node(int key, int value) {
this.key = key;
this.value = value;
}
}
public CustomHashMap() {
map = new LinkedList[SIZE];
for (int i = 0; i < SIZE; i++) {
map[i] = new LinkedList<>();
}
}
private int hash(int key) {
return key % SIZE;
}
public void put(int key, int value) {
int index = hash(key);
LinkedList<Node> bucket = map[index];
for (Node node : bucket) {
if (node.key == key) {
node.value = value;
return;
}
}
bucket.add(new Node(key, value));
}
public int get(int key) {
int index = hash(key);
LinkedList<Node> bucket = map[index];
for (Node node : bucket) {
if (node.key == key) {
return node.value;
}
}
return -1;
}
public void remove(int key) {
int index = hash(key);
LinkedList<Node> bucket = map[index];
for (Node node : bucket) {
if (node.key == key) {
bucket.remove(node);
return;
}
}
}
}

