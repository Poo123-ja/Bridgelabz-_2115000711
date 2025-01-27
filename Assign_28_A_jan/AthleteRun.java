import java.util.*;
public class AthleteRun{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the sides of tringle");
int side1=sc.nextInt();
int side2=sc.nextInt();
int side3=sc.nextInt();
System.out.println("Rounds needed are: "+Rounds(side1, side2, side3));
}
public static int Rounds(int side1, int side2, int side3){
int perimeter=side1+side2+side3;
int round=5/perimeter;
if(round==0)
round=1;
return round;
}
}
