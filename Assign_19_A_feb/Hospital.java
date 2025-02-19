import java.util.*;
public class HospitalTriage {
public static void main(String[] args) {
PriorityQueue<Patient> queue = new PriorityQueue<>(
(p1, p2) -> Integer.compare(p2.severity, p1.severity));
queue.add(new Patient("John", 3));
queue.add(new Patient("Alice", 5));
queue.add(new Patient("Bob", 2));
System.out.println("Treatment order:");
while (!queue.isEmpty()) {
System.out.println(queue.poll());
}
}
}
class Patient {
String name;
int severity;
public Patient(String name, int severity) {
this.name = name;
this.severity = severity;
}
public String toString() {
return name + " (Severity: " + severity + ")";
}
}
