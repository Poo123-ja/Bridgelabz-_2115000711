import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

class Person {
private int age;
public Person(int age) {
this.age = age;
}
}

public class AccessPrivate {
public static void main(String[] args) {
try {
Class<?> c = Person.class;
Constructor<?> constructor = c.getDeclaredConstructor(int.class);
Object personInstance = constructor.newInstance(21);
Field ageField = c.getDeclaredField("age");
ageField.setAccessible(true);
ageField.set(personInstance, 24);
System.out.println("Modified Age: " + ageField.get(personInstance));
} catch (Exception e) {
e.printStackTrace();
}
}
}
