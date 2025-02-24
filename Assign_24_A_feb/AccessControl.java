import java.lang.annotation.*;  
import java.lang.reflect.Method;  

@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)  
@interface RoleAllowed {  
String value();  
}  

class User {  
private String role;  
public User(String role) {  
this.role = role;  
}  
public String getRole() {  
return role;  
}  
}  

class SecureService {  
@RoleAllowed("ADMIN")  
public void adminTask() {  
System.out.println("Admin task executed successfully");
}
}

public class AccessControl {
public static void main(String[] args) throws Exception {  
User user1 = new User("ADMIN");
User user2 = new User("USER");
SecureService service = new SecureService();
invokeMethodIfAllowed(service, "adminTask", user1);
invokeMethodIfAllowed(service, "adminTask", user2);
}

private static void invokeMethodIfAllowed(Object obj, String methodName, User user) throws Exception {  
Method method = obj.getClass().getMethod(methodName);  
if (method.isAnnotationPresent(RoleAllowed.class)) {  
String requiredRole = method.getAnnotation(RoleAllowed.class).value();  
if (user.getRole().equals(requiredRole)) {  
method.invoke(obj);  
} else {  
System.out.println("Access Denied! User role: " + user.getRole() + " | Required role: " + requiredRole);  
}  
} else {  
method.invoke(obj);  
}  
}  
}
