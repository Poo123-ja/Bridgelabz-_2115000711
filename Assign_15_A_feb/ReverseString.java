import java.util.*;
public class ReverseString{
public static void main(String []args){
String str="Hello";
String reversedString=reverseString(str);
System.out.println("Original String :"+str);
System.out.println("Reversed String :"+reversedString);
}
public static String reverseString(String str){
StringBuilder s=new StringBuilder(str);
s.reverse();
return s.toString();
}
}



