import java.util.*;
public class TwoSum{
public static void main(String []args){
int []number={5,4,6,8};
int target=10;
int []result=findTwoSum(number,target);
if(result.length==2){
System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
}
else{
System.out.println("No solution is found");
}
}
public static int[] findTwoSum(int[]number,int target){
HashMap<Integer,Integer> map=new HashMap<>();
for(int i=0;i<number.length;i++){
int complement = target-number[i];
if(map.containsKey(complement)){
return new int[]{map.get(complement),i};
}
map.put(number[i],i);
}
return new int[0];
}
}
