import java.util.*;
public class LinearSearch {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of sentences: ");
int n = sc.nextInt();
sc.nextLine();
String[] s = new String[n];
System.out.println("Enter the sentences:");
for (int i = 0; i < n; i++) {
s[i] = sc.nextLine();
}

System.out.print("Enter the word ");
String word = sc.nextLine();
String result = findWord(s, word);
System.out.println("Result: " + result);
}

public static String findWord(String[] s, String word) {
for (String sentence : s) {
if (sentence.contains(word)) {
return sentence;
}
}
return "Not Found";
}
}
