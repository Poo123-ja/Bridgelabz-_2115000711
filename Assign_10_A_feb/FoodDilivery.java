import java.util.*;
public class FoodDilivey {
public static void main(String[] args) {
List<FoodItem> order = new ArrayList<>();
order.add(new VegItem("Paneer", 200, 2));
order.add(new NonVegItem("Chicken Biryani", 300, 1));

for (FoodItem item : order) {
System.out.println(item.getItemDetails());
System.out.println("Total Price: " + item.calculateTotalPrice());
if (item instanceof Discountable) {
Discountable discountItem = (Discountable) item;
discountItem.applyDiscount();
System.out.println(discountItem.getDiscountDetails());
}
System.out.println("-------------------------");
}
}
}

// Abstract class FoodItem
abstract class FoodItem {
private String itemName;
private double price;
private int quantity;

public FoodItem(String itemName, double price, int quantity) {
this.itemName = itemName;
this.price = price;
this.quantity = quantity;
}

public String getItemName() { return itemName; }
public double getPrice() { return price; }
public int getQuantity() { return quantity; }

public String getItemDetails() {
return "Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
}

public abstract double calculateTotalPrice();
}

// Interface Discountable
interface Discountable {
void applyDiscount();
String getDiscountDetails();
}

// VegItem class
class VegItem extends FoodItem implements Discountable {
public VegItem(String itemName, double price, int quantity) {
super(itemName, price, quantity);
}

@Override
public double calculateTotalPrice() {
return getPrice() * getQuantity();
}

@Override
public void applyDiscount() {
System.out.println("Discount applied on Veg Item: " + getItemName());
}

@Override
public String getDiscountDetails() {
return "Veg Item Discount: 10%";
}
}

// NonVegItem class
class NonVegItem extends FoodItem implements Discountable {
public NonVegItem(String itemName, double price, int quantity) {
super(itemName, price, quantity);
}

@Override
public double calculateTotalPrice() {
return getPrice() * getQuantity() + 20;
}

@Override
public void applyDiscount() {
System.out.println("Discount applied on Non-Veg Item: " + getItemName());
}

@Override
public String getDiscountDetails() {
return "Non-Veg Item Discount: 5%";
}
}

