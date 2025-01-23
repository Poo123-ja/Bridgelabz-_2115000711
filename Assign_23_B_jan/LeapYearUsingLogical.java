import java.util.Scanner;
class LeapYearUsingLogical{
	public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	int year = sc.nextInt();
	if(year < 1582){
	System.out.print("entered yaer is must be greater than 1582");
	}
	else{
		if((year%4 == 0 && year% 100 != 0) || (year%400 == 0)){
		System.out.println(year + " is a leap year");
		}
		else{
		System.out.print(year + " is not a leap year");
	}
}
}
}
