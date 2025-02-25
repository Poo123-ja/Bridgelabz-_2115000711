import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.util.Base64;
import java.util.ArrayList;
import java.util.List;

public class EncryptDecrypt {

private static final String ALGORITHM = "AES";
private static final String KEY_FILE = "aes_secret.key";

public static void generateKey() throws Exception {
File keyFile = new File(KEY_FILE);
if (!keyFile.exists()) {
KeyGenerator keyGenerator = KeyGenerator.getInstance(ALGORITHM);
keyGenerator.init(128);
SecretKey secretKey = keyGenerator.generateKey();
try (FileOutputStream fos = new FileOutputStream(KEY_FILE)) {
fos.write(secretKey.getEncoded());
}
}
}

public static SecretKey loadKey() throws Exception {
byte[] keyBytes = new byte[16];
try (FileInputStream fis = new FileInputStream(KEY_FILE)) {
fis.read(keyBytes);
}
return new SecretKeySpec(keyBytes, ALGORITHM);
}

public static String encrypt(String data, SecretKey secretKey) throws Exception {
Cipher cipher = Cipher.getInstance(ALGORITHM);
cipher.init(Cipher.ENCRYPT_MODE, secretKey);
byte[] encryptedBytes = cipher.doFinal(data.getBytes());
return Base64.getEncoder().encodeToString(encryptedBytes) + "\n";
}

public static String decrypt(String encryptedData, SecretKey secretKey) throws Exception {
Cipher cipher = Cipher.getInstance(ALGORITHM);
cipher.init(Cipher.DECRYPT_MODE, secretKey);
byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedData.trim()));
return new String(decryptedBytes) + "\n";
}

public static void writeEncryptedCSV(String fileName, List<String[]> data, SecretKey secretKey) throws Exception {
try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
writer.println("Name,Salary,Email");
for (String[] row : data) {
String encryptedSalary = encrypt(row[1], secretKey);
String encryptedEmail = encrypt(row[2], secretKey);
writer.println(row[0] + "," + encryptedSalary + "," + encryptedEmail);
}
}
}

public static void readDecryptedCSV(String fileName, SecretKey secretKey) throws Exception {
try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
String line = reader.readLine();
System.out.println(line + "\n");
while ((line = reader.readLine()) != null) {
String[] row = line.split(",");
String decryptedSalary = decrypt(row[1], secretKey);
String decryptedEmail = decrypt(row[2], secretKey);
System.out.println(row[0] + ", " + decryptedSalary + ", " + decryptedEmail);
}
}
}

public static void main(String[] args) {
try {
generateKey();
SecretKey secretKey = loadKey();

List<String[]> data = new ArrayList<>();
data.add(new String[]{"Alice", "50000", "alice@example.com"});
data.add(new String[]{"Bob", "60000", "bob@example.com"});

String fileName = "employees.csv";
writeEncryptedCSV(fileName, data, secretKey);
System.out.println("Encrypted data written to CSV.\n");

System.out.println("Decrypted Data from CSV:\n");
readDecryptedCSV(fileName, secretKey);

} catch (Exception e) {
e.printStackTrace();
}
}
}
