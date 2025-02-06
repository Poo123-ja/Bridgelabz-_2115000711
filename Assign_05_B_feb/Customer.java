import java.util.ArrayList;
public class Main {
public static void main(String[] args) {
Customer customer1=new Customer("Pooja");
Customer customer2=new Customer("Praveen");

Product product1=new Product("Laptop",1000);
Product product2=new Product("Phone",500);
Product product3=new Product("Headphones",100);

Order order1=new Order(101,customer1);
order1.addProduct(product1);
order1.addProduct(product3);

Order order2=new Order(102,customer2);
order2.addProduct(product2);
order2.addProduct(product3);

customer1.placeOrder(order1);
customer2.placeOrder(order2);

customer1.viewOrders();
customer2.viewOrders();
}
}

class Customer {
String name;
ArrayList<Order> orders;

Customer(String name) {
this.name=name;
this.orders=new ArrayList<>();
}

void placeOrder(Order order) {
orders.add(order);
System.out.println(name+" placed an order with ID:"+order.orderId);
}

void viewOrders() {
System.out.println(name+"'s Orders:");
for(Order order:orders) {
order.viewOrderDetails();
}
}
}

class Order {
int orderId;
Customer customer;
ArrayList<Product> products;

Order(int orderId,Customer customer) {
this.orderId=orderId;
this.customer=customer;
this.products=new ArrayList<>();
}

void addProduct(Product product) {
products.add(product);
}

void viewOrderDetails() {
System.out.println("Order ID:"+orderId+" placed by "+customer.name);
System.out.println("Products in order:");
for(Product product:products) {
System.out.println("-"+product.name+", Price: $"+product.price);
}
}
}

class Product {
String name;
double price;

Product(String name,double price) {
this.name=name;
this.price=price;
}
}
