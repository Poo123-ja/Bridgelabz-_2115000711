import java.io.*;
public class UserInfo {
public static void main(String[] args) {
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
String name = "";
String age = "";
String favoriteLanguage = "";
try {
System.out.print("Enter your name: ");
name = reader.readLine();
System.out.print("Enter your age: ");
age = reader.readLine();
System.out.print("Enter your favorite programming language: ");
favoriteLanguage = reader.readLine();
} catch (IOException e) {
System.out.println("Error reading input: " + e.getMessage());
return;
}

String outputFilePath = "C:\\Users\\POOJA\\Desktop\\Capgemini_Training\\Assign_21_A_feb\\outputFile.txt";
try (FileWriter writer = new FileWriter(outputFilePath)) {
writer.write("Name: " + name + "\n");
writer.write("Age: " + age + "\n");
writer.write("Favorite Programming Language: " + favoriteLanguage + "\n");
System.out.println("User information saved.");
} catch (IOException e) {
System.out.println("Error writing to file: " + e.getMessage());
}
}
}
