import java.util.*;
public class SortSet{
public static void main(String []args){
Set<Integer> set=new HashSet<>();
set.add(5);
set.add(3);
set.add(9);
set.add(2);
set.add(1);

List<Integer> sortedList=convertedToSortedList(set);
System.out.println(sortedList);
}
public static List<Integer> convertedToSortedList(Set<Integer>set){
List<Integer> list=new ArrayList<>(set);
int n=list.size();
for(int i=0; i<n; i++){
for(int j=0; j<n-i-1; j++){
if(list.get(j)>list.get(j+1)){
int temp=list.get(j);
list.set(j,list.get(j+1));
list.set(j+1,temp);
}
}
}
return list;
}
}


