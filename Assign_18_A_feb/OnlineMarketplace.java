public class OnlineMarketplace{
public static void main(String []args){
Product<BookCatalog> book = new Product<>("Java Programming", 50.0, new BookCatalog());
Product<ClothingCatalog> top = new Product<>("Top", 25.0, new ClothingCatalog());
Product<GadgetCatalog> phone = new Product<>("Smartphone", 300.0, new GadgetCatalog());

System.out.println("Original Price of " + book.getName() + ":" + book.getPrice());
System.out.println("Original Price of " +top.getName() +":" +top.getPrice());
System.out.println("Original Price of "+phone.getName()+":" +phone.getPrice());
ProductOperations.applyDiscount(book, 10);
ProductOperations.applyDiscount(top,15);
ProductOperations.applyDiscount(phone,20);
}
static class ProductCatalog{
private String name;
public ProductCatalog(String name){
this.name=name;
}
public String getName(){
return name;
}
}
static class BookCatalog extends ProductCatalog{
public BookCatalog(){
super("Book");
}
}
static class ClothingCatalog extends ProductCatalog{
public ClothingCatalog(){
super("Clothing");
}
}
static class GadgetCatalog extends ProductCatalog{
public GadgetCatalog(){
super("Gadget");
}
}
static class Product<T extends ProductCatalog>{
private String name;
private double price;
private T catagory;
public Product(String name,double price,T catagory){
this.name=name;
this.price=price;
this.catagory=catagory;
}
public String getName(){
return name;
}
public double getPrice(){
return price;
}
public T getCatagory(){
return catagory;
}
public void setPrice(double price){
this.price=price;
}
}
static class ProductOperations{
public static <T extends ProductCatalog> void applyDiscount(Product<T> product, double percentage){
double discountAmount=product.getPrice()*(percentage/100);
double discountedPrice=product.getPrice()-discountAmount;
product.setPrice(discountedPrice);
System.out.println("Discount:"+product.getName()+ ":" +discountedPrice);
}
}
}
