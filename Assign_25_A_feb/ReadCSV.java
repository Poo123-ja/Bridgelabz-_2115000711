import java.io.*;
public class ReadCSV{
public static void main(String []args){
String path="C:\\Users\\POOJA\\Desktop\\Capgemini_Training\\Assign_25_A_feb\\student.csv";
try(BufferedReader br=new BufferedReader(new FileReader(path))){
String line;
while((line=br.readLine())!=null){
String []columns=line.split(",");
System.out.println("Id:"+columns[0]+",Name:" +columns[1]+",Age:"+columns[2]+",Marks:"+columns[3]);
}
}
catch(IOException e){
System.out.println("Error while reading the file:"+e.getMessage());
}
}
}
