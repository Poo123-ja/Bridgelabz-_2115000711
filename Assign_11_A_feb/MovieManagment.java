import java.util.Scanner;

public class MovieManagement {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
MovieList movies = new MovieList();
while (true) {
System.out.println("1. Add at Beginning 2. Add at End 3. Add at Position 4. Remove by Title 5. Search by Director or Rating 6. Display All (Forward & Reverse) 7. Update Rating 8. Exit");
int choice = sc.nextInt();
if (choice == 1) {
System.out.println("Enter Title, Director, Year, Rating:");
movies.addAtBeginning(sc.next(), sc.next(), sc.nextInt(), sc.nextDouble());
}
if (choice == 2) {
System.out.println("Enter Title, Director, Year, Rating:");
movies.addAtEnd(sc.next(), sc.next(), sc.nextInt(), sc.nextDouble());
}
if (choice == 3) {
System.out.println("Enter Title, Director, Year, Rating, Position:");
movies.addAtPosition(sc.next(), sc.next(), sc.nextInt(), sc.nextDouble(), sc.nextInt());
}
if (choice == 4) {
System.out.println("Enter Movie Title:");
movies.removeByTitle(sc.next());
}
if (choice == 5) {
System.out.println("Search by 1. Director 2. Rating");
int searchType = sc.nextInt();
if (searchType == 1) {
System.out.println("Enter Director:");
movies.searchByDirector(sc.next());
} else {
System.out.println("Enter Rating:");
movies.searchByRating(sc.nextDouble());
}
}
if (choice == 6) {
System.out.println("Movies (Forward Order):");
movies.displayForward();
System.out.println("Movies (Reverse Order):");
movies.displayReverse();
}
if (choice == 7) {
System.out.println("Enter Movie Title and New Rating:");
movies.updateRating(sc.next(), sc.nextDouble());
}
if (choice == 8) {
break;
}
}
sc.close();
}
}

class Movie {
String title, director;
int year;
double rating;
Movie next, prev;
Movie(String title, String director, int year, double rating) {
this.title = title;
this.director = director;
this.year = year;
this.rating = rating;
this.next = this.prev = null;
}
}

class MovieList {
Movie head, tail;
void addAtBeginning(String title, String director, int year, double rating) {
Movie newMovie = new Movie(title, director, year, rating);
if (head == null) {
head = tail = newMovie;
return;
}
newMovie.next = head;
head.prev = newMovie;
head = newMovie;
}
void addAtEnd(String title, String director, int year, double rating) {
Movie newMovie = new Movie(title, director, year, rating);
if (tail == null) {
head = tail = newMovie;
return;
}
tail.next = newMovie;
newMovie.prev = tail;
tail = newMovie;
}
void addAtPosition(String title, String director, int year, double rating, int position) {
Movie newMovie = new Movie(title, director, year, rating);
if (position == 1) {
addAtBeginning(title, director, year, rating);
return;
}
Movie temp = head;
for (int i = 1; temp != null && i < position - 1; i++) temp = temp.next;
if (temp == null || temp.next == null) {
addAtEnd(title, director, year, rating);
return;
}
newMovie.next = temp.next;
newMovie.prev = temp;
temp.next.prev = newMovie;
temp.next = newMovie;
}
void removeByTitle(String title) {
if (head == null) return;
if (head.title.equalsIgnoreCase(title)) {
head = head.next;
if (head != null) head.prev = null;
else tail = null;
return;
}
Movie temp = head;
while (temp != null && !temp.title.equalsIgnoreCase(title)) temp = temp.next;
if (temp == null) return;
if (temp.next != null) temp.next.prev = temp.prev;
if (temp.prev != null) temp.prev.next = temp.next;
if (temp == tail) tail = temp.prev;
}
void searchByDirector(String director) {
Movie temp = head;
while (temp != null) {
if (temp.director.equalsIgnoreCase(director)) {
System.out.println("Title: " + temp.title + ", Year: " + temp.year + ", Rating: " + temp.rating);
}
temp = temp.next;
}
}
void searchByRating(double rating) {
Movie temp = head;
while (temp != null) {
if (temp.rating == rating) {
System.out.println("Title: " + temp.title + ", Director: " + temp.director + ", Year: " + temp.year);
}
temp = temp.next;
}
}
void displayForward() {
Movie temp = head;
while (temp != null) {
System.out.println("Title: " + temp.title + ", Director: " + temp.director + ", Year: " + temp.year + ", Rating: " + temp.rating);
temp = temp.next;
}
}
void displayReverse() {
Movie temp = tail;
while (temp != null) {
System.out.println("Title: " + temp.title + ", Director: " + temp.director + ", Year: " + temp.year + ", Rating: " + temp.rating);
temp = temp.prev;
}
}
void updateRating(String title, double newRating) {
Movie temp = head;
while (temp != null) {
if (temp.title.equalsIgnoreCase(title)) {
temp.rating = newRating;
return;
}
temp = temp.next;
}
}
}
