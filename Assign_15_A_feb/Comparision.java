import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
public class Compare {
public static long performanceTestInputStreamReader(){
String filePath = "C:\\Users\\POOJA\\Desktop\\Capgemini_Training\\Assign_15_A_feb\\FileLines.txt";
long startT = 0, endT = 0;
try(BufferedReader br = new BufferedReader( new InputStreamReader(new FileInputStream(filePath), "UTF-8"))){
String line;
int count = 0;
startT = System.nanoTime();
while((line = br.readLine())!=null){
String[] words = line.toLowerCase().split("\\W+");
for(String s : words){
count++;
}
}
endT = System.nanoTime();
System.out.println("Words in the given file: " + count);
}
catch (Exception e){
e.printStackTrace();
}
return endT-startT;
}
public static long performanceTestFileReader(){
String filePath = "C:\\Users\\POOJA\\Desktop\\Capgemini_Training\\Assign_15_A_feb\\FileLines.txt";
long startT = 0, endT = 0;
try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
String line;
int count = 0;
startT = System.nanoTime();
while((line = br.readLine())!=null){
String[] words = line.toLowerCase().split("\\W+");
for(String s : words){
count++;
}
}
endT = System.nanoTime();
System.out.println("Words in the given file: " + count);
}
catch (Exception e){
e.printStackTrace();
}
return endT-startT;
}
public static long performanceTestStringBuilder(String[] strArray){
long startTime, endTime;
StringBuilder sb = new StringBuilder();
startTime = System.nanoTime();
for(int i = 0; i < 1000000; i++){
for(String s : strArray){
sb.append(s);
}
}
endTime = System.nanoTime();
return endTime-startTime;
}
public static long performanceTestStringBuffer(String[] strArray){
long startTime, endTime;
StringBuffer sb = new StringBuffer();
startTime = System.nanoTime();
for(int i = 0; i < 1000000; i++){
for(String s : strArray){
sb.append(s);
}
}
endTime = System.nanoTime();
return endTime-startTime;
}
public static void main(String[] args) {
String[] stringArray = {"Apple", "Mango", "Banana"};
long timeTakenStringBuilder = performanceTestStringBuilder(stringArray);
long timeTakenStringBuffer = performanceTestStringBuffer(stringArray);
System.out.println("Performance Time of Sting Builder: " + timeTakenStringBuilder);
System.out.println("Performance Time of Sting Buffer: " + timeTakenStringBuffer);
if(timeTakenStringBuffer < timeTakenStringBuilder)
System.out.println("String Buffer is faster than String Builder");
else
System.out.println("String Builder is faster than String Buffer");

long timeTakenInputStreamReader = performanceTestInputStreamReader();
long timeTakenFileReader = performanceTestFileReader();
System.out.println("Performance Time of InputStreamReader: " + timeTakenInputStreamReader);
System.out.println("Performance Time of File Reader: " + timeTakenFileReader);
if(timeTakenFileReader < timeTakenInputStreamReader)
System.out.println("File Reader is faster than Input Stream Reader");
else
System.out.println("Input Stream Reader is faster than File Reader");
}
}
