import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
public class ConvertByteToCharacter{
public static void main(String []args){
String path="C:\\Users\\POOJA\\Desktop\\Capgemini_Training\\Assign_15_A_feb\\FileLines.txt";
try{
FileInputStream fileInputStream=new FileInputStream(path);
InputStreamReader inputStreamReader=new InputStreamReader(fileInputStream);
BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
String line;
while((line=bufferedReader.readLine())!=null){
System.out.println(line);
}
}
catch(IOException e){
System.out.println("error occured:"+e.getMessage());
}
}
}

