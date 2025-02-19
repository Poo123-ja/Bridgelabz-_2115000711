import java.util.*;
import java.io.*;
public class WordFrequencyCounter {
public static void main(String[] args) {
String fileName ="C:\\Users\\POOJA\\Desktop\\Capgemini_Training\\Assign_19_A_feb\\textFile..txt";
Map<String, Integer> wordCountMap = new HashMap<>();
try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
String line;
while ((line = reader.readLine()) != null) {
line = line.toLowerCase().replaceAll("[^a-zA-Z0-9 ]", "");
String[] words = line.split("\\s+");
for (String word : words) {
if (!word.isEmpty()) {
wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
}
}
}
} catch (IOException e) {
System.err.println("Error reading file: " + e.getMessage());
}
System.out.println(wordCountMap);
}
}
