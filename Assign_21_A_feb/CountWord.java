import java.io.*;
import java.util.*;
class CountWord {
public static void main(String[] args) {
String fileName = "C:\\Users\\POOJA\\Desktop\\Capgemini_Training\\Assign_21_A_feb\\source.txt";
Map<String, Integer> wordCountMap = new HashMap<>();

try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
String line;
while ((line = br.readLine()) != null) {
String[] words = line.toLowerCase().split("\\W+");
for (String word : words) {
if (!word.isEmpty()) {
wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
}
}
}
} catch (IOException e) {
System.out.println("Error reading file: " + e.getMessage());
}

wordCountMap.entrySet().stream()
.sorted((a, b) -> b.getValue().compareTo(a.getValue()))
.limit(100)
.forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
}
}
