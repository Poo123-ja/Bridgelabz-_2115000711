import java.util.*;
public class Book{
static String libraryName="Rainbow librarry";
private String author;
private String title;
final private String isbn;
public Book(String author,String title,String isbn){
this.author=author;
this.title=title;
this.isbn=isbn;
}
static void displayLibraryname(){
System.out.println("Library Name: "+libraryName);
}
public void Display(){
System.out.println("Book title: "+title);
System.out.println("Author Name: "+author);
System.out.println("ISBN: "+isbn);
}
public static void main(String [] args){
Book b=new Book("Indian Polity","m Lakshmikant","123456789");
System.out.println(b instanceof Book);
b.displayLibraryname();
b.Display();
}
}
