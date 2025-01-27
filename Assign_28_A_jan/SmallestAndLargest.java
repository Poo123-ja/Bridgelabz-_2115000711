import java.util.Scanner; 
public class SmallestAndLargest{ 
public static void main(String []args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the numbers");
int number1=sc.nextInt();
int number2=sc.nextInt();
int number3=sc.nextInt();
findSmallestAndLargest(number1, number2, number3);
}
public static void findSmallestAndLargest(int number1,int number2,int number3){
int max=Math.max(number1,Math.max(number2,number3));
int min=Math.min(number1,Math.min(number2,number3));
System.out.println("largest number is"+max);
System.out.println("smallest number is"+min);
}

}
