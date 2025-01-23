import java.util.Scanner;
class MultiplicationTable{
	public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	for(int i=6; i<=9; i++){
	number = number*i;
	System.out.print(number + " * " + i + " = " + number);
	}
}
}
