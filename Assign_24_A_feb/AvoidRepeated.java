import java.lang.annotation.*;  
import java.lang.reflect.InvocationHandler;  
import java.lang.reflect.Method;  
import java.lang.reflect.Proxy;  
import java.util.HashMap;  
import java.util.Map;  

@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)  
@interface CacheResult {}  

interface ExpensiveService {  
@CacheResult  
int computeSquare(int number);  
}  

class CacheHandler implements InvocationHandler {  
private final Object target;  
private final Map<String, Object> cache = new HashMap<>();  

public CacheHandler(Object target) {  
this.target = target;  
}  

@Override  
public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {  
if (method.isAnnotationPresent(CacheResult.class)) {  
String key = method.getName() + "(" + args[0] + ")";  
if (cache.containsKey(key)) {  
System.out.println("Returning cached result for: " + key);  
return cache.get(key);  
}  
Object result = method.invoke(target, args);  
cache.put(key, result);  
return result;  
}  
return method.invoke(target, args);  
}  
}  

class ExpensiveServiceImpl implements ExpensiveService {  
public int computeSquare(int number) {  
System.out.println("Computing square for: " + number);  
return number * number;  
}  
}  

public class AvoidRepeated {
public static void main(String[] args) {  
ExpensiveService service = (ExpensiveService) Proxy.newProxyInstance(  
ExpensiveService.class.getClassLoader(),  
new Class[]{ExpensiveService.class},  
new CacheHandler(new ExpensiveServiceImpl())  
);  

System.out.println(service.computeSquare(5));  
System.out.println(service.computeSquare(5));  
System.out.println(service.computeSquare(10));  
System.out.println(service.computeSquare(10));  
}  
}
