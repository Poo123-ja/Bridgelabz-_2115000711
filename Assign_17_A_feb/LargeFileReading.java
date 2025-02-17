import java.io.*;
public class LargeFileReading {
private static final String FILE_PATH = "C:\\Users\\POOJA\\Desktop\\Capgemini_Training\\Assign_17_A_feb\\largeFile.txt";
public static void main(String[] args) {
System.out.println("File Reader Comparison:");

long startTime = System.currentTimeMillis();
readUsingFileReader(FILE_PATH);
long endTime = System.currentTimeMillis();
System.out.println("Time taken using FileReader: " + (endTime - startTime) + " ms\n");

startTime = System.currentTimeMillis();
readUsingInputStreamReader(FILE_PATH);
endTime = System.currentTimeMillis();
System.out.println("Time taken using InputStreamReader: " + (endTime - startTime) + " ms\n");
}

private static void readUsingFileReader(String filePath) {
try (FileReader reader = new FileReader(filePath)) {
while (reader.read() != -1) {
}
} catch (IOException e) {
System.err.println("Error reading file with FileReader: " + e.getMessage());
}
}

private static void readUsingInputStreamReader(String filePath) {
try (InputStreamReader reader = new InputStreamReader(new FileInputStream(filePath))) {
while (reader.read() != -1) {
}
} catch (IOException e) {
System.err.println("Error reading file with InputStreamReader: " + e.getMessage());
}
}
}

