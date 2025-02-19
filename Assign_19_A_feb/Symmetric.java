import java.util.*;
public class Symmetric{
public static void main(String []args){
Set<Integer> set1=new HashSet<>();
set1.add(1);
set1.add(2);
set1.add(3);

Set<Integer> set2=new HashSet<>();
set2.add(3);
set2.add(4);
set2.add(5);

Set<Integer> symmetricDifferenceSet = computeDifference(set1,set2);
System.out.println(symmetricDifferenceSet);
}
public static Set<Integer> computeDifference(Set<Integer>set1, Set<Integer> set2){
Set<Integer> symmetricDifferenceSet=new HashSet<>();
for(Integer element:set1){
if(!set2.contains(element)){
symmetricDifferenceSet.add(element);
}
}
for(Integer element:set2){
if(!set1.contains(element)){
symmetricDifferenceSet.add(element);
}
}
return symmetricDifferenceSet;
}
}
