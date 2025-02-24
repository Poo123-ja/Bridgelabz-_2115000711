import java.lang.reflect.Field;
import java.util.Map;
import java.util.HashMap;
class ObjectMapper {
public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {
try {
T obj = clazz.getDeclaredConstructor().newInstance();
for (Map.Entry<String, Object> entry : properties.entrySet()) {
Field field = clazz.getDeclaredField(entry.getKey());
field.setAccessible(true);
field.set(obj, entry.getValue());
}
return obj;
} catch (Exception e) {
throw new RuntimeException("Error mapping properties to object", e);
}
}
}

class Person {
private String name;
private int age;

public String getName() { return name; }
public int getAge() { return age; }
}

public class ObjectMap {
public static void main(String[] args) {
Map<String, Object> properties = new HashMap<>();
properties.put("name", "khushi");
properties.put("age", 30);

Person person = ObjectMapper.toObject(Person.class, properties);
System.out.println("Name: " + person.getName());
System.out.println("Age: " + person.getAge());
}
}
