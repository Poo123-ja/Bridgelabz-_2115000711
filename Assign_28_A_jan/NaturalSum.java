import java.util.*;
public class NaturalSum{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int number=sc.nextInt();
int sum=FindSum(number);
System.out.println("Sum of "+number+" natural numbers is "+sum);
}
public static int FindSum(int number){
int sum=0;
while(number>0){
sum+=number;
number--;
}
return sum;
}
}
