import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;
@Retention(RetentionPolicy.RUNTIME)
@interface Inject {}
interface Service {
void perform();
}

class ServiceImpl implements Service {
public void perform() {
System.out.println("Service is performing...");
}
}
class Client {
@Inject
private Service service;

public void execute() {
service.perform();
}
}
class DIContainer {
private Map<Class<?>, Object> instances = new HashMap<>();

public void register(Class<?> clazz) {
try {
Constructor<?> constructor = clazz.getDeclaredConstructor();
constructor.setAccessible(true);
Object instance = constructor.newInstance();
instances.put(clazz, instance);
} catch (Exception e) {
throw new RuntimeException("Error registering class: " + clazz.getName(), e);
}
}

public void injectDependencies() {
for (Object obj : instances.values()) {
for (Field field : obj.getClass().getDeclaredFields()) {
if (field.isAnnotationPresent(Inject.class)) {
Class<?> dependencyType = field.getType();
Object dependency = instances.get(dependencyType);
if (dependency != null) {
field.setAccessible(true);
try {
field.set(obj, dependency);
} catch (IllegalAccessException e) {
throw new RuntimeException("Failed to inject dependency: " + dependencyType.getName(), e);
}
}
}
}
}
}

public <T> T getInstance(Class<T> clazz) {
return clazz.cast(instances.get(clazz));
}
}

public class Dependency {
public static void main(String[] args) {
DIContainer container = new DIContainer();
container.register(ServiceImpl.class);
container.register(Client.class);
container.injectDependencies();

Client client = container.getInstance(Client.class);
client.execute();
}
}
