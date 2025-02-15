import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class ReadFileLineByLine {
public static void main(String[] args) {
String filePath = "C:\\Users\\POOJA\\Desktop\\Capgemini_Training\\Assign_15_A_feb\\FileLines.txt";
try {
FileReader fileReader = new FileReader(filePath);
BufferedReader bufferedReader = new BufferedReader(fileReader);
String line;
while ((line = bufferedReader.readLine()) != null) {
System.out.println(line);
}
} catch (IOException e) {
System.out.println("An error occurred while reading the file: " + e.getMessage());
}
}
}
