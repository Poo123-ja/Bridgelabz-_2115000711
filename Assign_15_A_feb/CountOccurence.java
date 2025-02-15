import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class CountWordOccurrences {
public static void main(String[] args) {
String filePath = "C:\\Users\\POOJA\\Desktop\\Capgemini_Training\\Assign_15_A_feb\\FileLines.txt";
String targetWord = "Mango";
int wordCount = 0;
try {
FileReader fileReader = new FileReader(filePath);
BufferedReader bufferedReader = new BufferedReader(fileReader);
String line;
while ((line = bufferedReader.readLine()) != null) {
String[] words = line.split("\\s+");
for (String word : words) {
if (word.equals(targetWord)) {
wordCount++;
}
}
}
bufferedReader.close();
} catch (IOException e) {
System.out.println("An error occurred : " + e.getMessage());
}
System.out.println("The word '" + targetWord + "' appears " + wordCount + " times in the file.");
}
}
