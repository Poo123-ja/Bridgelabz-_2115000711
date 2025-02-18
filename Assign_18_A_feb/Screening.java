import java.util.*;
public class Screening {
public static void main(String[] args) {
Resume<SoftwareEngineer> softwareEngineerResume = new Resume<>(new SoftwareEngineer());
Resume<DataScientist> dataScientistResume = new Resume<>(new DataScientist());
Resume<ProductManager> productManagerResume = new Resume<>(new ProductManager());
System.out.println("Processing Resume for: " + softwareEngineerResume.getJobRole().getRoleName());
System.out.println("Processing Resume for: " + dataScientistResume.getJobRole().getRoleName());
System.out.println("Processing Resume for: " + productManagerResume.getJobRole().getRoleName());
List<JobRole> jobRoles = new ArrayList<>();
jobRoles.add(softwareEngineerResume.getJobRole());
jobRoles.add(dataScientistResume.getJobRole());
jobRoles.add(productManagerResume.getJobRole());
ResumeScreeningPipeline.screenResumes(jobRoles);
}
abstract static class JobRole {
public abstract String getRoleName();
}
static class SoftwareEngineer extends JobRole {
@Override
public String getRoleName() {
return "Software Engineer";
}
}
static class DataScientist extends JobRole {
@Override
public String getRoleName() {
return "Data Scientist";
}
}
static class ProductManager extends JobRole {
@Override
public String getRoleName() {
return "Product Manager";
}
}
static class Resume<T extends JobRole> {
private T jobRole;
public Resume(T jobRole) {
this.jobRole = jobRole;
}
public T getJobRole() {
return jobRole;
}
}
static class ResumeScreeningPipeline {
public static void screenResumes(List<? extends JobRole> resumes) {
for (JobRole jobRole : resumes) {
System.out.println("Screening Resume for: " + jobRole.getRoleName() + " Screening Successful");
}
}
}
}
