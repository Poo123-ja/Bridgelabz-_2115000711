import java.io.*;
public class CheckedException {
public static void main(String[] args) {
String fileName = "C:\\Users\\POOJA\\Desktop\\Capgemini_Training\\Assign_22_A_feb\\data.txt";
try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
String line;
while ((line = reader.readLine()) != null) {
System.out.println(line);
}
} catch (FileNotFoundException e) {
System.out.println("File not found");
} catch (IOException e) {
System.out.println("An error occurred while reading the file.");
}
}
}
