import java.io.*;
public class WriteCSV{
public static void main(String []args){
String path="C:\\Users\\POOJA\\Desktop\\Capgemini_Training\\Assign_25_A_feb\\write.csv";
try(BufferedWriter bw=new BufferedWriter(new FileWriter(path))){
bw.write("Id,Name,Department,Salary\n");
bw.write("101,Khushi,HR,50000\n");
bw.write("102,Krishna,IT,100000\n");
bw.write("103,Pooja,Sales,80000\n");
bw.write("104,Baibhavi,Operations,40000\n");
bw.write("105,Archi,Staff,60000\n");
System.out.println("CSV file written.");
}

catch(IOException e){
System.out.println("Error"+e.getMessage());
}
}
}
