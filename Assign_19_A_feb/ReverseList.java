import java.util.*;
public class ReverseList{
public static ArrayList<Integer> reversedArrayList(ArrayList<Integer> list){
ArrayList<Integer> reversedList=new ArrayList<>();
for(int i=list.size()-1; i>=0; i--){
reversedList.add(list.get(i));
}
return reversedList;
}
public static LinkedList<Integer> reversedLinkedList(LinkedList<Integer> list){
LinkedList<Integer> reversedList=new LinkedList<>();
for(int i=list.size()-1; i>=0; i--){
reversedList.add(list.get(i));
}
return reversedList;
}
public static void main(String []args){
ArrayList<Integer> arrayList=new ArrayList<>();

arrayList.add(1);
arrayList.add(2);
arrayList.add(3);
arrayList.add(4);
arrayList.add(5);

System.out.println("Original Array list:"+arrayList);
ArrayList<Integer> reversedArrayList=reversedArrayList(arrayList);
System.out.println("Reversed Array list:"+reversedArrayList);

LinkedList<Integer> linkedList=new LinkedList<>();
linkedList.add(1);
linkedList.add(2);
linkedList.add(3);
linkedList.add(4);
linkedList.add(5);

System.out.println("Original linked list:"+linkedList);
LinkedList<Integer> reversedLinkedList=reversedLinkedList(linkedList);
System.out.println("Reversed linked list:"+reversedLinkedList);
}
}



