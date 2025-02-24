import java.lang.annotation.*;  
import java.lang.reflect.Field;  

@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.FIELD)  
@interface MaxLength {  
int value();  
}  

class User {  
@MaxLength(10)  
private String username;  

public User(String username) {  
validateMaxLength(username);  
this.username = username;  
System.out.println("User created successfully: " + username);  
}  

private void validateMaxLength(String username) {  
try {  
Field field = this.getClass().getDeclaredField("username");  
if (field.isAnnotationPresent(MaxLength.class)) {  
int maxLength = field.getAnnotation(MaxLength.class).value();  
System.out.println("Validating username: " + username + " (Max Length: " + maxLength + ")");  
if (username.length() > maxLength) {  
throw new IllegalArgumentException("Username exceeds max length of " + maxLength + " characters.");  
}  
}  
} catch (NoSuchFieldException e) {  
e.printStackTrace();  
}  
}  
}  

public class FieldValidation {  
public static void main(String[] args) {  
new User("Pooja");  
new User("VeryLongUsername");  
}  
}
