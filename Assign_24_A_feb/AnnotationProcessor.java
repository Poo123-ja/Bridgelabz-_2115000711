import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)  
@interface ImportantMethod {  
String level() default "HIGH";  
}  

class MyClass {  
@ImportantMethod  
public void criticalFunction() {  
System.out.println("Executing critical function");  
}  

@ImportantMethod(level = "MEDIUM")  
public void regularFunction() {  
System.out.println("Executing regular function");  
}  

public void normalFunction() {  
System.out.println("Executing normal function");  
}  
}  

public class AnnotationProcessor {  
public static void main(String[] args) {  
Method[] methods = MyClass.class.getDeclaredMethods();  

for (Method method : methods) {  
if (method.isAnnotationPresent(ImportantMethod.class)) {  
ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);  
System.out.println("Method: " + method.getName() + " | Importance Level: " + annotation.level());  
}  
}  

MyClass obj = new MyClass();  
obj.criticalFunction();  
obj.regularFunction();  
obj.normalFunction();  
}  
}  
