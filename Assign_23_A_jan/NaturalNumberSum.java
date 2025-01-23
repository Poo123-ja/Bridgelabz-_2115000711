import java.util.Scanner;
class NaturalNumberSum{
	public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	if(number <= 0){
	System.out.print("The number is not Natural number");
	}
	else{
	int formulaSum = number*(number+1)/2;
	int loopSum =0;
	int counter =1;
	while(counter <= number){
	loopSum += counter;
	counter++;
	}
	System.out.print("sum using formula" + formulaSum);
	System.out.print("sum using While loop " + loopSum);
	if(formulaSum == loopSum){
	System.out.print("Both computation are correct ");
	}
	else{
	System.out.print("There is an error in the computation");
	}
	}
}
}
