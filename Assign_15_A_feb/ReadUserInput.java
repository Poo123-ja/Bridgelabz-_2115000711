import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;
public class ReadInput {
public static void main(String[] args) {
String Path = "C:\\Users\\POOJA\\Desktop\\Capgemini_Training\\Assign_15_A_feb\\FileLines.txt";
try {
InputStreamReader inputStreamReader = new InputStreamReader(System.in);
BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
FileWriter fileWriter = new FileWriter(Path);
System.out.println("Enter text (type 'exit' to stop):");
String line;
while (!(line = bufferedReader.readLine()).equalsIgnoreCase("exit")) {
fileWriter.write(line + System.lineSeparator());
}
System.out.println("written to " + Path);
} catch (IOException e) {
System.out.println("An error occurred: " + e.getMessage());
}
}
}
