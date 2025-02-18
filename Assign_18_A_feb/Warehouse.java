import java.util.*;
public class Warehouse {
public static void main(String[] args) {
Storage<Electronics> electronics = new Storage<>();
Storage<Groceries> groceries = new Storage<>();
Storage<Furniture> furniture = new Storage<>();
electronics.addItem(new Electronics("T.V."));
electronics.addItem(new Electronics("phone"));
groceries.addItem(new Groceries("Grapes"));
groceries.addItem(new Groceries("Oats"));
furniture.addItem(new Furniture("Sofa"));
furniture.addItem(new Furniture("Bed"));
System.out.println("Electronics items:");
Storage.displayAllItems(electronics.getAllItems());
System.out.println("Groceries items:");
Storage.displayAllItems(groceries.getAllItems());
System.out.println("Furniture items:");
Storage.displayAllItems(furniture.getAllItems());
}
}

abstract class WarehouseItem {
private String name;

public WarehouseItem(String name) {
this.name = name;
}

public String getName() {
return name;
}

@Override
public String toString() {
return "Item: " + name + " (" + this.getClass().getSimpleName() + ")";
}
}

class Electronics extends WarehouseItem {
public Electronics(String name) {
super(name);
}
}

class Groceries extends WarehouseItem {
public Groceries(String name) {
super(name);
}
}

class Furniture extends WarehouseItem {
public Furniture(String name) {
super(name);
}
}

class Storage<T extends WarehouseItem> {
private List<T> items = new ArrayList<>();

public void addItem(T item) {
items.add(item);
}

public T getItem(int index) {
if (index >= 0 && index < items.size()) {
return items.get(index);
} else {
throw new IndexOutOfBoundsException("Invalid index");
}
}

public static void displayAllItems(List<? extends WarehouseItem> items) {
for (WarehouseItem item : items) {
System.out.println(item);
}
}

public List<T> getAllItems() {
return items;
}
}
