import java.util.*;
public class CircleArea{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
Circle c=new Circle();
c.radius=sc.nextInt();
c.area();
c.circumference();
}
}
class Circle{
int radius;
public void area(){
double area=radius*3.14*radius;
System.out.println("Area of circle is:"+area);
}
public void circumference(){
double circumference=2*3.14*radius;
System.out.println("Circumference of circle is:"+circumference);
}
}
