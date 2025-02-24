import java.lang.reflect.Field;

class Configuration {
private static String API_KEY = "ORIGINAL_KEY";
public static String getApiKey() {
return API_KEY;
}
}

public class ModifyStatic {
public static void main(String[] args) {
try {
Class<Configuration> configClass = Configuration.class;
Field apiKeyField = configClass.getDeclaredField("API_KEY");
apiKeyField.setAccessible(true);
apiKeyField.set(null, "MODIFIED_KEY");
System.out.println("Updated API_KEY: " + Configuration.getApiKey());
} catch (Exception e) {
e.printStackTrace();
}
}
}
