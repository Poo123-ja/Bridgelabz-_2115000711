import java.util.Scanner;
public class SimpleInterest{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the principle,rate and time");
int rate = sc.nextInt();
int principle = sc.nextInt();
int time = sc.nextInt();
System.out.println("The simple interest is : "+Interest(rate,principle,time));
}
public static double Interest(int rate ,int principle,int time){
return principle*rate*time*0.01;
}
}
