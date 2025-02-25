import java.io.*;
public class CountRow{
public static void main(String []args){
String path="student.csv";
int row=0;
try(BufferedReader br=new BufferedReader(new FileReader(path))){
String line;
boolean isHeader=true;
while((line=br.readLine())!=null){
if(isHeader){
isHeader=false;
continue;
}
row++;
}
System.out.println("Total number of rows:"+row);
}
catch(IOException e){
System.out.println("error occurs"+e.getMessage());
}
}
}
