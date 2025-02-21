import java.io.*;
public class BufferReader {
public static void main(String[] args) {
String sourceFilePath = "C:\\Users\\POOJA\\Desktop\\Capgemini_Training\\Assign_21_A_feb\\source.txt";
String destinationFilePath = "C:\\Users\\POOJA\\Desktop\\Capgemini_Training\\Assign_21_A_feb\\destination.txt";
final int BUFFER_SIZE = 4096;

long startTime, endTime;
try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFilePath));
BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destinationFilePath))) {
startTime = System.nanoTime();
byte[] buffer = new byte[BUFFER_SIZE];
int bytesRead;
while ((bytesRead = bis.read(buffer)) != -1) {
bos.write(buffer, 0, bytesRead);
}
bos.flush();
endTime = System.nanoTime();
System.out.println("Buffered Stream Copy Time: " + (endTime - startTime) + " nanoseconds");
} catch (IOException e) {
System.out.println("Error copying file with buffered streams: " + e.getMessage());
}
try (FileInputStream fis = new FileInputStream(sourceFilePath);
FileOutputStream fos = new FileOutputStream(destinationFilePath)) {
startTime = System.nanoTime();
byte[] buffer = new byte[BUFFER_SIZE];
int bytesRead;
while ((bytesRead = fis.read(buffer)) != -1) {
fos.write(buffer, 0, bytesRead);
}
fos.flush();
endTime = System.nanoTime();
System.out.println("Unbuffered Stream Copy Time: " + (endTime - startTime) + " nanoseconds");
} catch (IOException e) {
System.out.println("Error copying file with unbuffered streams: " + e.getMessage());
}
}
}
