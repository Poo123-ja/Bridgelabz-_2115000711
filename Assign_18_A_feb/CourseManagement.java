public class CourseManagement{
public static void main(String []args){
Course<ExamCourse> examCourse = new Course<>("English", new ExamCourse());
Course<AssignmentCourse> assignmentCourse = new Course<>("Maths", new AssignmentCourse());
Course<ResearchCourse> researchCourse = new Course<>("Chemistry", new ResearchCourse());

System.out.println(examCourse.getCourseName() + ": " + examCourse.getEvaluationMethod());
System.out.println(assignmentCourse.getCourseName() + ": " + assignmentCourse.getEvaluationMethod());
System.out.println(researchCourse.getCourseName() + ": " + researchCourse.getEvaluationMethod());

List<CourseType> allCourses = new ArrayList<>();
allCourses.add(examCourse.getCourseType());
allCourses.add(assignmentCourse.getCourseType());
allCourses.add(researchCourse.getCourseType());

CourseManager.printCourseDetails(allCourses);
}
static abstract class CourseType{
public abstract String getEvaluateMethod()
}
static class ExamCourse extends CourseType{
@Override
public string getEvaluateMethod(){
return "Exam based Evaluation";
}
}
static class AssignmentCourse extends CourseType{
@Override
public String getEvaluateMathod(){
return "Assignment based evaluation";
}
}
static class ReasearchCourse extends CourseType{
@Override
public String getEvaluateMethod(){
return "Research based evaluation";
}
}
static class Course<T extends CourseType>{
private String corseName;
private T courseType;

public Course(String name,T courseType){
this.name=name;
this.courseType=courseType;
}
}
public String getName(){
return name;
}
public T getCourseType(){
return courseType;
}
public String getEvaluateMethod(){
return courseType.getEvaluateMethod;
}
}
static class CourseManager{
public static void printCourseDetails(List< extends courseType>courses){
for(courseType course:courses){
System.out.println("Course evaluation:"+course.getEvaluateMethod());
}
}
}
