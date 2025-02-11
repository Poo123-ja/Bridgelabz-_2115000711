public class Main {
public static void main(String[] args) {
LibraryManagementSystem library = new LibraryManagementSystem();
library.addBook("The Great Gatsby", "F. Scott Fitzgerald", "Fiction", 101, true, null);
library.addBook("1984", "George Orwell", "Dystopian", 102, true, null);
library.addBook("Moby Dick", "Herman Melville", "Adventure", 103, false, null);
System.out.println("Books in the library (Forward):");
System.out.println(library.displayBooksForward());
System.out.println("Search results for '1984':");
System.out.println(library.searchBook("1984"));
System.out.println(library.updateAvailability(103, true));
System.out.println("Books in the library (Reverse):");
System.out.println(library.displayBooksReverse());
System.out.println("Total number of books in the library: " + library.countBooks());
System.out.println(library.removeBook(102));
System.out.println("Books in the library after removal:");
System.out.println(library.displayBooksForward());
}
}

class BookNode {
String bookTitle;
String author;
String genre;
int bookId;
boolean isAvailable;
BookNode next;
BookNode prev;
public BookNode(String bookTitle, String author, String genre, int bookId, boolean isAvailable) {
this.bookTitle = bookTitle;
this.author = author;
this.genre = genre;
this.bookId = bookId;
this.isAvailable = isAvailable;
this.next = null;
this.prev = null;
}
}
class LibraryManagementSystem {
BookNode head;
BookNode tail;
public LibraryManagementSystem() {
this.head = null;
this.tail = null;
}
public void addBook(String bookTitle, String author, String genre, int bookId, boolean isAvailable, Integer position) {
BookNode newBook = new BookNode(bookTitle, author, genre, bookId, isAvailable);
if (head == null) {
head = newBook;
tail = newBook;
} else {
if (position == null) {
tail.next = newBook;
newBook.prev = tail;
tail = newBook;
} else {
BookNode current = head;
int index = 1;
while (index < position && current.next != null) {
current = current.next;
index++;
}
newBook.next = current.next;
if (current.next != null) {
current.next.prev = newBook;
}
current.next = newBook;
newBook.prev = current;
}
}
}
public String removeBook(int bookId) {
if (head == null) {
return "No books to remove";
}
BookNode current = head;
while (current != null) {
if (current.bookId == bookId) {
if (current.prev != null) {
current.prev.next = current.next;
} else {
head = current.next;
}
if (current.next != null) {
current.next.prev = current.prev;
} else {
tail = current.prev;
}
return "Book with ID " + bookId + " removed";
}
current = current.next;
}
return "Book with ID " + bookId + " not found";
}
public String searchBook(String searchTerm) {
if (head == null) {
return "No books in the library";
}
BookNode current = head;
StringBuilder result = new StringBuilder();
while (current != null) {
if (current.bookTitle.contains(searchTerm) || current.author.contains(searchTerm)) {
result.append("Book Title: ").append(current.bookTitle)
.append(", Author: ").append(current.author)
.append(", Genre: ").append(current.genre)
.append(", Book ID: ").append(current.bookId)
.append(", Available: ").append(current.isAvailable ? "Yes" : "No")
.append("\n");
}
current = current.next;
}
return result.length() > 0 ? result.toString() : "No books found with that search term";
}
public String updateAvailability(int bookId, boolean isAvailable) {
if (head == null) {
return "No books in the library";
}
BookNode current = head;
while (current != null) {
if (current.bookId == bookId) {
current.isAvailable = isAvailable;
return "Book ID " + bookId + " availability updated to " + (isAvailable ? "Available" : "Not Available");
}
current = current.next;
}
return "Book with ID " + bookId + " not found";
}
public String displayBooksForward() {
if (head == null) {
return "No books to display";
}
StringBuilder books = new StringBuilder();
BookNode current = head;
while (current != null) {
books.append("Book Title: ").append(current.bookTitle)
.append(", Author: ").append(current.author)
.append(", Genre: ").append(current.genre)
.append(", Book ID: ").append(current.bookId)
.append(", Available: ").append(current.isAvailable ? "Yes" : "No")
.append("\n");
current = current.next;
}
return books.toString();
}
public String displayBooksReverse() {
if (tail == null) {
return "No books to display";
}
StringBuilder books = new StringBuilder();
BookNode current = tail;
while (current != null) {
books.append("Book Title: ").append(current.bookTitle)
.append(", Author: ").append(current.author)
.append(", Genre: ").append(current.genre)
.append(", Book ID: ").append(current.bookId)
.append(", Available: ").append(current.isAvailable ? "Yes" : "No")
.append("\n");
current = current.prev;
}
return books.toString();
}
public int countBooks() {
int count = 0;
BookNode current = head;
while (current != null) {
count++;
current = current.next;
}
return count;
}
}

