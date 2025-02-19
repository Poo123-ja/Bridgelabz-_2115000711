import java.util.*;
public class ShoppingCart{
public static void main(String[]args){
Map<String,Double>productPrices=new HashMap<>();
Map<String,Double>cart=new LinkedHashMap<>();
Map<Double,String>sortedCart=new TreeMap<>();
addProduct(productPrices,"Apple",1.5);
addProduct(productPrices,"Banana",0.8);
addProduct(productPrices,"Orange",1.2);
addProduct(productPrices,"Grapes",2.5);
addToCart(cart,productPrices,"Apple");
addToCart(cart,productPrices,"Banana");
addToCart(cart,productPrices,"Orange");
for(Map.Entry<String,Double>entry:cart.entrySet())sortedCart.put(entry.getValue(),entry.getKey());
System.out.println("Cart Items:");
display(cart);
System.out.println("\nItems Sorted by Price:");
for(Double price:sortedCart.keySet())System.out.println(sortedCart.get(price)+" -> $"+price);
}
static void addProduct(Map<String,Double>products,String name,double price){
products.put(name,price);
}
static void addToCart(Map<String,Double>cart,Map<String,Double>products,String product){
if(products.containsKey(product))cart.put(product,products.get(product));
}
static void display(Map<String,Double>cart){
for(String item:cart.keySet())System.out.println(item+" -> $"+cart.get(item));
}
}
