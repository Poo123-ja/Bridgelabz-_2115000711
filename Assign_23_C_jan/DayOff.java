import java.util.*;
public class DayOff {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int m = sc.nextInt();
int d = sc.nextInt();
int y = sc.nextInt();
int y0 = y - (14 - m) / 12;
int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
int m0 = m + 12 * ((14 - m) / 12) - 2;
int d0 = (d + x + 31 * m0 / 12) % 7;
if(d0==0)
System.out.println("The day of the week is Sunday");
if(d0==1)
System.out.println("The day of the week is Monday");
if(d0==2)
System.out.println("The day of the week is Tuesday");
if(d0==3)
System.out.println("The day of the week is Wednesday");
if(d0==4)
System.out.println("The day of the week is Thursday");
if(d0==5)
System.out.println("The day of the week is Friday");
if(d0==6)
System.out.println("The day of the week is Saturday");
}
}

