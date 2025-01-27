import java.util.Scanner;
public class SpringSeason{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the month and day");
int month=sc.nextInt();
int day=sc.nextInt();
Season(month,day);
}
public static void Season(int month, int day){
if(month==3 && day>20)
System.out.println("Entered Date falls in Spring Season");
else
if(month>3 && month < 6)
System.out.println("Entered Date falls in Spring Season");
else
if(month==6 && day<20)
System.out.println("Entered Date falls in Spring Season");
else
System.out.println("Entered Date does not falls in Spring Season");
}
}
