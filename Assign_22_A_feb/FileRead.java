import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FileRead {
public static void main(String[] args) {
String fileName = "C:\\Users\\POOJA\\Desktop\\Capgemini_Training\\Assign_22_A_feb\\data.txt";
try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
String firstLine = reader.readLine();
System.out.println("First line: " + firstLine);
} catch (IOException e) {
System.out.println("Error reading file");
}
}
}
