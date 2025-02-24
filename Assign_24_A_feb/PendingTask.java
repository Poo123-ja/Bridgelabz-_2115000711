import java.lang.annotation.*;  
import java.lang.reflect.Method;  

@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)  
@interface Todo {  
String task();  
String assignedTo();  
String priority() default "MEDIUM";  
}  

class Project {  
@Todo(task = "Implement user authentication", assignedTo = "pooja", priority = "HIGH")  
public void authenticateUser() {  
System.out.println("Authenticating user");
}  

@Todo(task = "Optimize database queries", assignedTo = "khushi")
public void optimizeDatabase() {  
System.out.println("Optimizing database");  
}  

@Todo(task = "Enhance UI responsiveness", assignedTo = "khushi", priority = "LOW")  
public void improveUI() {  
System.out.println("Improving UI");
}  

public void completedFeature() {  
System.out.println("This feature is complete.");  
}  
}  

public class PendingTask{  
public static void main(String[] args) {  
Class<Project> obj = Project.class;  

for (Method method : obj.getDeclaredMethods()) {  
if (method.isAnnotationPresent(Todo.class)) {  
Todo todo = method.getAnnotation(Todo.class);  
System.out.println("Method: " + method.getName());  
System.out.println("Task: " + todo.task());  
System.out.println("Assigned To: " + todo.assignedTo());  
System.out.println("Priority: " + todo.priority());  
}  
}  
}  
}

