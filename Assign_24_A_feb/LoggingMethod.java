import java.lang.annotation.*;  
import java.lang.reflect.Method;  

@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)  
@interface LogExecutionTime {}  

class PerformanceTest {  
@LogExecutionTime  
public void fastMethod() {  
System.out.println("Executing fast method.");  
}  

@LogExecutionTime  
public void slowMethod() {  
System.out.println("Executing slow method");  
try { Thread.sleep(100); } catch (InterruptedException e) { e.printStackTrace(); }  
}  
}  

public class LoggingMethod {
public static void main(String[] args) throws Exception {  
PerformanceTest obj = new PerformanceTest();  
Class<?> clazz = obj.getClass();  

for (Method method : clazz.getDeclaredMethods()) {  
if (method.isAnnotationPresent(LogExecutionTime.class)) {  
long startTime = System.nanoTime();  
method.invoke(obj);  
long endTime = System.nanoTime();  
System.out.println("Execution Time of " + method.getName() + ": " + (endTime - startTime) / 1_000_000.0 + " ms");  
}
}
}
}
