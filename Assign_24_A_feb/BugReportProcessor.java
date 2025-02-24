import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)  
@interface BugReports {  
BugReport[] value();  
}  

@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)  
@Repeatable(BugReports.class)  
@interface BugReport {  
String description();  
}  

class SoftwareModule {  
@BugReport(description = "Null pointer exception ")  
@BugReport(description = "Memory leak when processing large datasets.")  
public void processData() {  
System.out.println("Processing data...");  
}  
}  

public class BugReportProcessor {  
public static void main(String[] args) {  
try {  
Method method = SoftwareModule.class.getMethod("processData");  

if (method.isAnnotationPresent(BugReports.class)) {  
BugReports bugReports = method.getAnnotation(BugReports.class);  
for (BugReport bug : bugReports.value()) {  
System.out.println("Bug Report: " + bug.description());  
}  
}  

SoftwareModule module = new SoftwareModule();  
module.processData();  

} catch (NoSuchMethodException e) {  
e.printStackTrace();  
}  
}  
}  
