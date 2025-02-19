import java.util.*;
public class Duplicate{
public static List<Integer> removeDuplicates(List<Integer>list){
Set<Integer> seen=new HashSet<>();
List<Integer> ans=new ArrayList<>();

for(Integer item:list){
if(!seen.contains(item)){
seen.add(item);
ans.add(item);
}
}
return ans;
}
public static void main(String []args){
List<Integer> input=Arrays.asList(3,1,2,2,3,4);
List<Integer> ans=removeDuplicates(input);
System.out.println(ans);
}
}

