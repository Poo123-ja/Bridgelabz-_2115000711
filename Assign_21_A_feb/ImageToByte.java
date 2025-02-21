import java.io.*;
public class ImageByteArrayConverter {
public static void main(String[] args) {
String inputImagePath = "C:\\Users\\POOJA\\Desktop\\Capgemini_Training\\Assign_21_A_feb\\Image.png";
String outputImagePath = "output.png";
byte[] imageBytes = null;
try (ByteArrayOutputStream baos = new ByteArrayOutputStream(); FileInputStream fis = new FileInputStream(inputImagePath)) {
int byteData;
while ((byteData = fis.read()) != -1) {
baos.write(byteData);
}
imageBytes = baos.toByteArray();
System.out.println("Image successfully converted to byte array.");
} catch (IOException e) {
System.out.println("Error reading or converting image: " + e.getMessage());
return;
}
try (ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes); FileOutputStream fos = new FileOutputStream(outputImagePath)) {
int byteData;
while ((byteData = bais.read()) != -1) {
fos.write(byteData);
}
System.out.println("Image successfully written to new file.");
} catch (IOException e) {
System.out.println("Error writing image: " + e.getMessage());
}
}
}
