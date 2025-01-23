import java.util.Scanner;
class OddEven{
	public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	if(number <= 0){
	System.out.print("enter the natural number greater than 0.");
	}
	else{
	for(int i=1; i<=number; i++){
	if(i%2==0){
		System.out.print( i + " is even number ");
	}
	else{
	System.out.print( i + " is  odd number ");
	}
 	}
}
}
}
