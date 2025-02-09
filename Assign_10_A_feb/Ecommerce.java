import java.util.*;
public class Main {
public static void main(String[] args) {
Product electronicProduct = new Electronics("E001", "Smartphone", 1000);
Product clothingProduct = new Clothing("C001", "T-Shirt", 50);
Product groceryProduct = new Groceries("G001", "Apples", 30);
Product[] products = { electronicProduct, clothingProduct, groceryProduct };
for (Product product : products) {
System.out.println("Product: " + product.getName());
System.out.println("Final Price: $" + product.calculateFinalPrice());
if (product instanceof Taxable) {
System.out.println(((Taxable) product).getTaxDetails());
}
System.out.println();
}
}
}
abstract class Product {
private String productId;
private String name;
private double price;
public Product(String productId, String name, double price) {
this.productId = productId;
this.name = name;
this.price = price;
}
public String getProductId() {
return productId;
}
public void setProductId(String productId) {
this.productId = productId;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public double getPrice() {
return price;
}
public void setPrice(double price) {
this.price = price;
}
public abstract double calculateDiscount();
public double calculateFinalPrice() {
double discount = calculateDiscount();
double tax = calculateTax();
return price + tax - discount;
}
public abstract double calculateTax();
}
interface Taxable {
double calculateTax();
String getTaxDetails();
}
class Electronics extends Product implements Taxable {
public Electronics(String productId, String name, double price) {
super(productId, name, price);
}
@Override
public double calculateDiscount() {
return getPrice() * 0.1;
}
@Override
public double calculateTax() {
return getPrice() * 0.15;
}
@Override
public String getTaxDetails() {
return "Electronics are taxed at 15%.";
}
}
class Clothing extends Product implements Taxable {
public Clothing(String productId, String name, double price) {
super(productId, name, price);
}
@Override
public double calculateDiscount() {
return getPrice() * 0.2;
}
@Override
public double calculateTax() {
return getPrice() * 0.08;
}
@Override
public String getTaxDetails() {
return "Clothing is taxed at 8%.";
}
}
class Groceries extends Product {
public Groceries(String productId, String name, double price) {
super(productId, name, price);
}
@Override
public double calculateDiscount() {
return getPrice() * 0.05;
}
@Override
public double calculateTax() {
return 0;
}
}



