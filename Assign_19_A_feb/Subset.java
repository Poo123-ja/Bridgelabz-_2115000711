import java.util.*;
public class Subset{
public static void main(String []args){
Set<Integer> set1=new HashSet<>();
set1.add(2);
set1.add(3);
set1.add(4);

Set<Integer>set2=new HashSet<>();
set2.add(1);
set2.add(2);
set2.add(3);
set2.add(4);
set2.add(5);

boolean isSubset=isSubset(set1,set2);
System.out.println(isSubset);
}
public static boolean isSubset(Set<Integer>set1,Set<Integer>set2){
for(Integer element:set1){
if(!set2.contains(element)){
return false;
}
}
return true;
}
}

