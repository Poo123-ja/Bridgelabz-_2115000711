import java.util.Scanner;
public class QuotientAndRemainder{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int number1 = sc.nextInt();
int number2 = sc.nextInt();
int [] result = findRemainderAndQuotient(number1,number2);
System.out.println("Quotienbt"+result[0]);
System.out.println("Remainder"+result[1]);
}
public static int[] findRemainderAndQuotient(int number1,int number2){
int [] result=new int[2];
result[0]= number1/number2;
result[1]=number1%number2;
return result;
}
}

