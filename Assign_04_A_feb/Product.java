public class Product{
static int discount=20;
private String productName;
private int price;
private int quantity;
final private String productID="123";
public Product(String productName,int price,int quantity){
this.productName=productName;
this.price=price;
this.quantity=quantity;
}
static int updateDiscount(int d){
discount=d;
return d;

}
public void Display(){
System.out.println("Product Name :"+productName);
System.out.println("Product ID:"+productID);
System.out.println("Product Quantity:"+quantity);
}
public static void main(String []args){
Product p=new Product("chocolate",200,2);
p.Display();
System.out.println(p instanceof Product);
System.out.println("New Discount:"+p.updateDiscount(30));
}
}
