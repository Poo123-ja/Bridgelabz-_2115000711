import java.lang.reflect.*; 
public class MethodExecutionTiming{ 
public static void main(String[] args) throws Exception { 
SampleOperations operations = new SampleOperations(); 
MethodTimer.measureExecutionTime(operations); 
} 
}
class MethodTimer { 
public static void measureExecutionTime(Object obj) throws Exception { 
Class<?> clazz = obj.getClass(); 
for (Method method : clazz.getDeclaredMethods()) { 
if (Modifier.isPublic(method.getModifiers()) && method.getParameterCount() == 0) { 
method.setAccessible(true); 
long start = System.nanoTime(); 
method.invoke(obj); 
long end = System.nanoTime(); 
System.out.println(method.getName() + " executed in " + (end - start) + " nanoseconds"); 
} 
} 
} 
} 
class SampleOperations { 
public void taskOne() { 
for (int i = 0; i < 1000; i++); 
} 
public void taskTwo() { 
for (int i = 0; i < 100000; i++); 
} 
} 
