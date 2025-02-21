import java.io.*;
public class UppercaseToLowercaseConverter {
public static void main(String[] args) {
String inputFilePath = "C:\\Users\\POOJA\\Desktop\\Capgemini_Training\\Assign_21_A_feb\\outputFile.txt";
String outputFilePath = "output.txt";

try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
String line;
while ((line = reader.readLine()) != null) {
writer.write(line.toLowerCase());
writer.newLine();
}
System.out.println("File successfully converted to lowercase and written to output.");
} catch (IOException e) {
System.out.println("Error processing file: " + e.getMessage());
}
}
}
