cimport java.util.*;
public class  Frequency{
public static Map<String,Integer> countFrequency(List<String>items){
Map<String,Integer> frequencyMap=new HashMap<>();
for(String item:items){
if(frequencyMap.containsKey(item)){
int count=frequencyMap.get(item);
frequencyMap.put(item,count+1);
}
else{
frequencyMap.put(item,1);
}
}
return frequencyMap;
}
public static void main(String []args){
List<String>input=Arrays.asList("Apple","Banana","Apple","orange");
Map<String,Integer> frequencyMap=countFrequency(input);
System.out.println("Original input"+input);
System.out.println("After count:"+frequencyMap);
}
}

