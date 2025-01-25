import java.util.Scanner;
public class YoungestFriend{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
int [] age=new int[3];
int [] height=new int[3];
int maxHeight=0;
int minAge=Integer.MAX_VALUE;
String tallest="";
String youngest="";
System.out.println("Enter the ages");
for(int i=0; i<3; i++){
age[i]=sc.nextInt();
if(minAge>age[i]){
minAge=age[i];
if(i==0)
youngest="Amar";
else if(i==1)
youngest="Akbar";
else
youngest="Anthony";
}
}
System.out.println("Enter the heights");
for(int i=0; i<3; i++){
height[i]=sc.nextInt();
if(maxHeight<height[i]){
maxHeight=height[i];
if(i==0)
tallest="Amar";
else if(i==1)
tallest="Akbar";
else
tallest="Anthony";
}
}
System.out.println("Youngest in all "+minAge+" is "+youngest);
System.out.println("Tallest in all "+maxHeight+" is "+tallest);
}
}
