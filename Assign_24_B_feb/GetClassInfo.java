import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class GetClassInfo {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the fully qualified class name: ");
String className = sc.nextLine();

try {
Class<?> c = Class.forName(className);

System.out.println("\nClass Name: " + c.getName());
System.out.println("\nConstructors:");
Constructor<?>[] constructors = c.getDeclaredConstructors();
for (Constructor<?> constructor : constructors) {
System.out.println(constructor);
}

System.out.println("\nMethods:");
Method[] methods = c.getDeclaredMethods();
for (Method method : methods) {
System.out.println(method);
}

System.out.println("\nFields:");
Field[] fields = c.getDeclaredFields();
for (Field field : fields) {
System.out.println(field);
}

} catch (ClassNotFoundException e) {
System.out.println("Class not found: " + className);
}
}
}
