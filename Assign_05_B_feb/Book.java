import java.util.ArrayList;
public class Main {
public static void main(String[] args) {
Book book1 = new Book("Lucent", "Dr.Binay karna");
Book book2 = new Book("Indian Polity","m Lakshmikant");

Library library1 = new Library("City Library");
Library library2 = new Library("University Library");

library1.addBook(book1);
library1.addBook(book2);
library2.addBook(book2);

library1.showBooks();
library2.showBooks();
}
}
class Book {

String title;
String author;

Book(String title, String author) {
this.title = title;
this.author = author;
}

void display() {
System.out.println("Title: " + title + ", Author: " + author);
}
}

class Library {
String name;
ArrayList<Book> books;

Library(String name) {
this.name = name;
this.books = new ArrayList<>();
}

void addBook(Book book) {
books.add(book);
}

void showBooks() {
System.out.println("Library: " + name);
for (Book book : books) {
book.display();
}
}
}

