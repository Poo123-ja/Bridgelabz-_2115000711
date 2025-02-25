import java.io.*;
import java.util.*;
public class SearchRecord{
public static void main(String []args){
String path="student.csv";
Scanner sc=new Scanner(System.in);
System.out.println("employee to be search");
String name=sc.nextLine().trim();
boolean found=false;
try(BufferedReader br=new BufferedReader(new FileReader(path))){
String line;
while((line=br.readLine())!=null){
String []details=line.split(",");
 if (details.length >= 3 && details[0].trim().equalsIgnoreCase(name)) {
System.out.println("Department:"+details[0]);
System.out.println("Salary"+details[1]);
found=true;
break;
}
}
}
catch(IOException e){
System.out.println("error reading file"+e.getMessage());
}
if(!found){
System.out.println("employee not found");
}
}
}
