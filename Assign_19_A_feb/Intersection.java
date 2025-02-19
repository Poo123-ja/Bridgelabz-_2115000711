import java.util.*;
public class Intersection{
public static void main(String []args){
Set<Integer> set1=new HashSet<>();
set1.add(1);
set1.add(2);
set1.add(3);

Set<Integer> set2=new HashSet<>();
set2.add(3);
set2.add(4);
set2.add(5);

Set<Integer> unionSet= computeUnion(set1,set2);
Set<Integer> intersectionSet= computeIntersection(set1,set2);

System.out.println("Union:"+unionSet);
System.out.println("Intersection:"+intersectionSet);
}
public static Set<Integer> computeUnion(Set<Integer>set1,Set<Integer>set2){
Set<Integer> unionSet=new HashSet<>();
for(Integer element:set1){
unionSet.add(element);
}
for(Integer element:set2){
if(!unionSet.contains(element)){
unionSet.add(element);
}
}
return unionSet;
}
public static Set<Integer> computeIntersection(Set<Integer>set1,Set<Integer>set2){
Set<Integer> intersectionSet=new HashSet<>();
for(Integer element:set1){
if(set2.contains(element)){
intersectionSet.add(element);
}
}
return intersectionSet;
}
}

