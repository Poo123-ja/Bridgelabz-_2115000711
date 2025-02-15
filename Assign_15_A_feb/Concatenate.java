import java.util.*;
public class Concatenate{
public static void main(String []args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number of string to be concatenate");
int n=sc.nextInt();
sc.nextLine();
String []str=new String[n];
for(int i=0; i<n; i++){
System.out.println("Enter the string" +(i+1));
str[i]=sc.nextLine();
}
String result=concatenateStrings(str);
System.out.println("concatenate String "+result);
}
public static String concatenateStrings(String[] str){
StringBuffer sb=new StringBuffer();
for(String s:str){
sb.append(s);
}
return sb.toString();
}
}

