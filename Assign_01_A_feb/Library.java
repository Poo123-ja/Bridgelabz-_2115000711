public class Book{
private String title;
private String author;
private boolean availability;
private int price;
public Book(){
title="";
author="";
price=0;
availability=true;
}
public Book(String author, String title, int price, boolean availability){
this.author=author;
this.title=title;
this.price=price;
this.availability=availability;
}
public void isAvailable(){
if(availability)
System.out.println("Book "+title+" is borrowable");
else
System.out.println("Book "+title+" is not borrowable");
}
public static void main(String [] args){
Book b1=new Book();
Book b2=new Book("Alice Feeny","The HouseMaid",300,true);
Book b3=new Book("Khai","Demon Mine",500,false);
b1.isAvailable();
b2.isAvailable();
b3.isAvailable();
}
}
