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

class Calculator {
private int multiply(int a, int b) {
return a * b;
}
}

class Student {
private String name;
public Student() {
this.name = "Default Student";
}
public String getName() {
return name;
}
}

public class Dynamic {
public static void main(String[] args) {
try {
Class<?> personClass = Person.class;
Constructor<?> personConstructor = personClass.getDeclaredConstructor(int.class);
Object personInstance = personConstructor.newInstance(25);
Field ageField = personClass.getDeclaredField("age");
ageField.setAccessible(true);
ageField.set(personInstance, 30);
System.out.println("Modified Age: " + ageField.get(personInstance));

Class<?> calculatorClass = Calculator.class;
Object calculatorInstance = calculatorClass.getDeclaredConstructor().newInstance();
Method multiplyMethod = calculatorClass.getDeclaredMethod("multiply", int.class, int.class);
multiplyMethod.setAccessible(true);
int result = (int) multiplyMethod.invoke(calculatorInstance, 5, 4);
System.out.println("Multiplication Result: " + result);

Class<?> studentClass = Student.class;
Object studentInstance = studentClass.getDeclaredConstructor().newInstance();
Method getNameMethod = studentClass.getDeclaredMethod("getName");
String studentName = (String) getNameMethod.invoke(studentInstance);
System.out.println("Student Name: " + studentName);
} catch (Exception e) {
e.printStackTrace();
}
}
}
