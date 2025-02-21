import java.io.*;
public class FileHandling{
public static void main(String[] args) {
String sourceFilePath = "C:\\Users\\POOJA\\Desktop\\Capgemini_Training\\Assign_21_A_feb\\source.txt";
String destinationFilePath = "C:\\Users\\POOJA\\Desktop\\Capgemini_Training\\Assign_21_A_feb\\destination.txt";
FileInputStream fis = null;
FileOutputStream fos = null;
try {
File sourceFile = new File(sourceFilePath);
if (!sourceFile.exists()) {
System.out.println("Source file does not exist.");
return;
}
fis = new FileInputStream(sourceFile);
File destinationFile = new File(destinationFilePath);
if (!destinationFile.exists()) {
destinationFile.createNewFile();
}
fos = new FileOutputStream(destinationFile);
int byteData;
while ((byteData = fis.read()) != -1) {
fos.write(byteData);
}
System.out.println("File copied successfully.");
} catch (IOException e) {
System.out.println("An error occurred: " + e.getMessage());
} finally {
try {
if (fis != null) {
fis.close();
}
if (fos != null) {
fos.close();
}
} catch (IOException e) {
System.out.println("Error closing streams: " + e.getMessage());
}
}
}
}
