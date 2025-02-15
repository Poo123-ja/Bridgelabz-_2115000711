import java.util.*;
public class  RemoveDuplicates{
public static void main(String []args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the String:");
String str=sc.nextLine();
String duplicate=removeDuplicates(str);
System.out.println("Original string:"+str);
System.out.println("After Removing duplicate :"+duplicate);
}
public static String removeDuplicates(String str){
StringBuilder s= new StringBuilder();
HashSet<Character> seen=new HashSet<>();
for( char c:str.toCharArray()){
if(!seen.contains(c)){
s.append(c);
seen.add(c);
}
}
return s.toString();
}
}


