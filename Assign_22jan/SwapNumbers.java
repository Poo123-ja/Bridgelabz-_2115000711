import java.util.Scanner;
	class SwapNmubers{
	public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	int number1 = sc.nextInt();;
	int number2 = sc.nextInt();
	System.out.println("Before swapping" + number1+ "," +number2);
	int temp=number1;
	 number1=number2;
	 number2=temp;
	System.out.println("The swapped numbers are" + number1 + "and" + number2);
}
}
