import java.util.*;
public class Suppress{
public static void main(String []args){
@SuppressWarnings("unchecked")
ArrayList list=new ArrayList();
list.add("aman");
list.add(123);
list.add(2.33);
System.out.println(list);
}
}

