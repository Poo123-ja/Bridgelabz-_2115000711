import java.lang.reflect.Field;

class JsonConverter {
public static String toJson(Object obj) {
StringBuilder json = new StringBuilder("{");
Class<?> clazz = obj.getClass();
Field[] fields = clazz.getDeclaredFields();
for (int i = 0; i < fields.length; i++) {
fields[i].setAccessible(true);
try {
json.append("\"").append(fields[i].getName()).append("\": ");
Object value = fields[i].get(obj);
if (value instanceof String) {
json.append("\"").append(value).append("\"");
} else {
json.append(value);
}
if (i < fields.length - 1) {
json.append(", ");
}
} catch (IllegalAccessException e) {
throw new RuntimeException("Error accessing field: " + fields[i].getName(), e);
}
}
json.append("}");
return json.toString();
}
}

class Person {
private String name;
private int age;

public Person(String name, int age) {
this.name = name;
this.age = age;
}
}

public class JSONConverter {
public static void main(String[] args) {
Person person = new Person("khushi", 20);
String json = JsonConverter.toJson(person);
System.out.println(json);
}
}
