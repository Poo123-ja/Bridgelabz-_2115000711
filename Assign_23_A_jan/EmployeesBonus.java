import java.util.Scanner;
class EmployeesBonus{
	public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	double salary = sc.nextDouble();
	int yearOfService = sc.nextInt();
	double bonus =0;
	if(yearOfService > 5){
	bonus = salary*0.05;
	}
	System.out.print("The bonus of employees is:" +bonus);
	}
}

