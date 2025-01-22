import java.util.Scanner;
class MaximumNumberHandshake{
	public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	int numberOfStudents = sc.nextInt();
	int maximumNumberHandshake = (numberOfStudents *(numberOfStudents-1))/2;
	System.out.println("The number of possible handshake is " +maximumNumberHandshake);
}


}
