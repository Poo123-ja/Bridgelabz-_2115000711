import java.util.Scanner;
class Factorial{
	public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	if(number < 0){
	System.out.print("Factorial is not defined for negative numbers");
	}
	else{
	 long factorial = 1;
	int i =1;
	while(i <= number){
	factorial *= i;
	i++;

	}
	System.out.print("The factorial  of " + number + "is" +factorial);

	}
}
}
