import java.util.*;
public class Temperature{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
double angle=sc.nextInt();
angle=Math.toRadians(angle);
double [] values=calculateTrigonometricFunctions(angle);
System.out.println("Sine conversion: "+values[0]);
System.out.println("Cosine conversion: "+values[1]);
System.out.println("Tangent conversion: "+values[2]);
}
public static double[] calculateTrigonometricFunctions(double angle){
double [] values=new double[3];
values[0]=Math.sin(angle);
values[1]=Math.cos(angle);
values[2]=Math.tan(angle);
return values;
}
}

