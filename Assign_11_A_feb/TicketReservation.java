class TicketReservationSystem {
private class Ticket {
int ticketID;
String customerName, movieName, seatNumber, bookingTime;
Ticket next;
Ticket(int ticketID, String customerName, String movieName, String seatNumber, String bookingTime) {
this.ticketID = ticketID;
this.customerName = customerName;
this.movieName = movieName;
this.seatNumber = seatNumber;
this.bookingTime = bookingTime;
this.next = null;
}
}
private Ticket last;
private int count;
public TicketReservationSystem() {
this.last = null;
this.count = 0;
}
public void addTicket(int ticketID, String customerName, String movieName, String seatNumber, String bookingTime) {
Ticket newTicket = new Ticket(ticketID, customerName, movieName, seatNumber, bookingTime);
if (last == null) {
last = newTicket;
last.next = last;
} else {
newTicket.next = last.next;
last.next = newTicket;
last = newTicket;
}
count++;
}
public void removeTicket(int ticketID) {
if (last == null) return;
Ticket current = last.next, prev = last;
do {
if (current.ticketID == ticketID) {
if (current == last && current.next == last) {
last = null;
} else {
prev.next = current.next;
if (current == last) last = prev;
}
count--;
return;
}
prev = current;
current = current.next;
} while (current != last.next);
}
public void displayTickets() {
if (last == null) {
System.out.println("No tickets booked.");
return;
}
Ticket current = last.next;
do {
System.out.println("Ticket ID: " + current.ticketID + ", Customer: " + current.customerName + ", Movie: " + current.movieName + ", Seat: " + current.seatNumber + ", Time: " + current.bookingTime);
current = current.next;
} while (current != last.next);
}
public void searchTicket(String query) {
if (last == null) return;
Ticket current = last.next;
do {
if (current.customerName.equalsIgnoreCase(query) || current.movieName.equalsIgnoreCase(query)) {
System.out.println("Found Ticket - ID: " + current.ticketID + ", Customer: " + current.customerName + ", Movie: " + current.movieName + ", Seat: " + current.seatNumber + ", Time: " + current.bookingTime);
}
current = current.next;
} while (current != last.next);
}
public int getTotalTickets() {
return count;
}
public static void main(String[] args) {
TicketReservationSystem system = new TicketReservationSystem();
system.addTicket(1, "Palak", "Avengers", "A1", "12:00 PM");
system.addTicket(2, "Piyush", "Batman", "B2", "02:00 PM");
system.displayTickets();
System.out.println("Total Tickets: " + system.getTotalTickets());
system.removeTicket(1);
system.displayTickets();
System.out.println("Total Tickets: " + system.getTotalTickets());
system.searchTicket("Batman");
}
}
