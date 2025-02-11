import java.util.Scanner;
public class InventoryManagement {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
InventoryList inventory = new InventoryList();
while (true) {
System.out.println("1. Add at Beginning 2. Add at End 3. Add at Position 4. Remove by ID 5. Update Quantity 6. Search by ID or Name 7. Calculate Total Value 8. Sort Inventory 9. Exit");
int choice = sc.nextInt();
if (choice == 1) {
System.out.println("Enter Item Name, Item ID, Quantity, Price:");
inventory.addAtBeginning(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextDouble());
}
if (choice == 2) {
System.out.println("Enter Item Name, Item ID, Quantity, Price:");
inventory.addAtEnd(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextDouble());
}
if (choice == 3) {
System.out.println("Enter Item Name, Item ID, Quantity, Price, Position:");
inventory.addAtPosition(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextDouble(), sc.nextInt());
}
if (choice == 4) {
System.out.println("Enter Item ID:");
inventory.removeById(sc.nextInt());
}
if (choice == 5) {
System.out.println("Enter Item ID and New Quantity:");
inventory.updateQuantity(sc.nextInt(), sc.nextInt());
}
if (choice == 6) {
System.out.println("Enter Item ID or Name:");
if (sc.hasNextInt()) inventory.searchById(sc.nextInt());
else inventory.searchByName(sc.next());
}
if (choice == 7) {
System.out.println("Total Inventory Value: " + inventory.calculateTotalValue());
}
if (choice == 8) {
System.out.println("Sort by 1. Name 2. Price (Ascending: true/false)");
inventory.sortInventory(sc.nextInt(), sc.nextBoolean());
}
if (choice == 9) {
break;
}
}
sc.close();
}
}

class Item {
String name;
int id, quantity;
double price;
Item next;
Item(String name, int id, int quantity, double price) {
this.name = name;
this.id = id;
this.quantity = quantity;
this.price = price;
this.next = null;
}
}

class InventoryList {
Item head;
void addAtBeginning(String name, int id, int quantity, double price) {
Item newItem = new Item(name, id, quantity, price);
newItem.next = head;
head = newItem;
}
void addAtEnd(String name, int id, int quantity, double price) {
Item newItem = new Item(name, id, quantity, price);
if (head == null) {
head = newItem;
return;
}
Item temp = head;
while (temp.next != null) temp = temp.next;
temp.next = newItem;
}
void addAtPosition(String name, int id, int quantity, double price, int position) {
Item newItem = new Item(name, id, quantity, price);
if (position == 1) {
newItem.next = head;
head = newItem;
return;
}
Item temp = head;
for (int i = 1; temp != null && i < position - 1; i++) temp = temp.next;
if (temp == null) return;
newItem.next = temp.next;
temp.next = newItem;
}
void removeById(int id) {
if (head == null) return;
if (head.id == id) {
head = head.next;
return;
}
Item temp = head, prev = null;
while (temp != null && temp.id != id) {
prev = temp;
temp = temp.next;
}
if (temp == null) return;
prev.next = temp.next;
}
void updateQuantity(int id, int newQuantity) {
Item temp = head;
while (temp != null) {
if (temp.id == id) {
temp.quantity = newQuantity;
return;
}
temp = temp.next;
}
}
void searchById(int id) {
Item temp = head;
while (temp != null) {
if (temp.id == id) {
System.out.println("Item: " + temp.name + ", ID: " + temp.id + ", Quantity: " + temp.quantity + ", Price: " + temp.price);
return;
}
temp = temp.next;
}
System.out.println("Item not found.");
}
void searchByName(String name) {
Item temp = head;
while (temp != null) {
if (temp.name.equalsIgnoreCase(name)) {
System.out.println("Item: " + temp.name + ", ID: " + temp.id + ", Quantity: " + temp.quantity + ", Price: " + temp.price);
return;
}
temp = temp.next;
}
System.out.println("Item not found.");
}
double calculateTotalValue() {
double total = 0;
Item temp = head;
while (temp != null) {
total += temp.price * temp.quantity;
temp = temp.next;
}
return total;
}
void sortInventory(int type, boolean ascending) {
head = mergeSort(head, type, ascending);
}
Item mergeSort(Item head, int type, boolean ascending) {
if (head == null || head.next == null) return head;
Item mid = getMiddle(head);
Item nextToMid = mid.next;
mid.next = null;
Item left = mergeSort(head, type, ascending);
Item right = mergeSort(nextToMid, type, ascending);
return merge(left, right, type, ascending);
}
Item merge(Item left, Item right, int type, boolean ascending) {
if (left == null) return right;
if (right == null) return left;
boolean condition = type == 1 ? left.name.compareToIgnoreCase(right.name) < 0 : left.price < right.price;
if (!ascending) condition = !condition;
if (condition) {
left.next = merge(left.next, right, type, ascending);
return left;
} else {
right.next = merge(left, right.next, type, ascending);
return right;
}
}
Item getMiddle(Item head) {
if (head == null) return head;
Item slow = head, fast = head;
while (fast.next != null && fast.next.next != null) {
slow = slow.next;
fast = fast.next.next;
}
return slow;
}
}
