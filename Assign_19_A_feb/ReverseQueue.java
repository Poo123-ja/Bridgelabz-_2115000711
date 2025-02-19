import java.util.*;
public class ReverseQueue{
public static void main(String []args){
Queue<Integer> queue=new LinkedList<>();
queue.add(2);
queue.add(3);
queue.add(4);
queue.add(5);
System.out.println("Original queue:"+queue);
reversedQueue(queue);
System.out.println("Reversed queue:"+queue);
}
public static void reversedQueue(Queue<Integer> queue){
if(queue.isEmpty()){
return ;
}
int front=queue.remove();
reversedQueue(queue);
queue.add(front);
}
}

