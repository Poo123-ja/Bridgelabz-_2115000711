import java.io.*;
class LargeFile {
public static void main(String[] args) {
String fileName = "C:\\Users\\POOJA\\Desktop\\Capgemini_Training\\Assign_21_A_feb\\Large.txt";
try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
String line;
while ((line = br.readLine()) != null) {
if (line.toLowerCase().contains("error")) {
System.out.println(line);
}
}
} catch (IOException e) {
System.out.println("Error reading file: " + e.getMessage());
}
}
}
