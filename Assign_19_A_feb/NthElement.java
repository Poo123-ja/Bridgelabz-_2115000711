import java.util.*;
public class NthElementFromEnd {
public static String findNthFromEnd(LinkedList<String> list, int n) {
Iterator<String> first = list.iterator();
Iterator<String> second = list.iterator();
for (int i = 0; i < n; i++)
first.next();
while (first.hasNext()){
first.next();
second.next();
}
return second.next();
}
public static void main(String[] args) {
LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
System.out.println(findNthFromEnd(list, 2));
}
}

