import java.util.*;
public class BookDetails{
public static void main(String [] args){
Book b1=new Book();
b1.Display();
Book b2=new Book("M lakshmikant","Indian Polity",600);
b2.Display();
}
}
class Book{
private String title;
private String author;
private int price;
public Book(){
title="Unknown";
author="Unknown";
price=0;
}
public Book(String author, String title, int price){
this.author=author;
this.title=title;
this.price=price;
}
public void Display(){
System.out.println("Author: "+author);
System.out.println("Title: "+title);
System.out.println("Price: "+price);
}
}
