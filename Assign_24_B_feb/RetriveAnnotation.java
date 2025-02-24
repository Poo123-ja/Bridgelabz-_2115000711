import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.reflect.AnnotatedElement;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Author {
String name();
}

@Author(name = "pooja")
class MyClass {
}

public class RetriveAnnotation {
public static void main(String[] args) {
Class<MyClass> obj = MyClass.class;
if (obj.isAnnotationPresent(Author.class)) {
Author author = obj.getAnnotation(Author.class);
System.out.println("Author: " + author.name());
} else {
System.out.println("No @Author annotation present.");
}
}
}
