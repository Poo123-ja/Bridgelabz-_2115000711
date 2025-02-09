import java.util.*;

public class Main{
public static void main(String[] args) {
List<LibraryItem> items = new ArrayList<>();
items.add(new Book("B001", "Indian Polity", "M Lakshmikant"));
items.add(new Magazine("M001", "National Geographic", "Various"));
items.add(new DVD("D001", "Inception", "Christopher Nolan"));

for (LibraryItem item : items) {
System.out.println(item.getItemDetails());
System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
if (item instanceof Reservable) {
Reservable reservableItem = (Reservable) item;
System.out.println("Availability: " + (reservableItem.checkAvailability() ? "Available" : "Not Available"));
reservableItem.reserveItem();
}
System.out.println("-------------------------");
}
}
}
abstract class LibraryItem {
private String itemId;
private String title;
private String author;

public LibraryItem(String itemId, String title, String author) {
this.itemId = itemId;
this.title = title;
this.author = author;
}

public String getItemId() { return itemId; }
public String getTitle() { return title; }
public String getAuthor() { return author; }

public String getItemDetails() {
return "ID: " + itemId + ", Title: " + title + ", Author: " + author;
}

public abstract int getLoanDuration();
}

// Interface Reservable
interface Reservable {
void reserveItem();
boolean checkAvailability();
}

// Book class
class Book extends LibraryItem implements Reservable {
public Book(String itemId, String title, String author) {
super(itemId, title, author);
}

@Override
public int getLoanDuration() {
return 14; // 14 days loan duration
}

@Override
public void reserveItem() {
System.out.println("Book reserved: " + getTitle());
}

@Override
public boolean checkAvailability() {
return true;
}
}

// Magazine class
class Magazine extends LibraryItem {
public Magazine(String itemId, String title, String author) {
super(itemId, title, author);
}

@Override
public int getLoanDuration() {
return 7; // 7 days loan duration
}
}

// DVD class
class DVD extends LibraryItem implements Reservable {
public DVD(String itemId, String title, String author) {
super(itemId, title, author);
}

@Override
public int getLoanDuration() {
return 5; // 5 days loan duration
}

@Override
public void reserveItem() {
System.out.println("DVD reserved: " + getTitle());
}

@Override
public boolean checkAvailability() {
return false;
}
}


