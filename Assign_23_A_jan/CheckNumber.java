import java.util.Scanner;
class CheckNumber{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	if(number > 0){
	System.out.println("The number is positive" +number);
	}
	else if(number < 0){
        System.out.println("The number is negetive" +number);
	}
	else{
        System.out.println("The number is Zero" +number);
	}
}
}
