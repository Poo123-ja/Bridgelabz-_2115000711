import java.util.Scanner;
class TempratureConversion{
	public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	double celcius = sc.nextDouble();
	double farenheitResult = (celcius * 9/5) + 32;
	System.out.println("The" +celcius+ "celsius is" +farenheitResult + "fahrenheit");
}
}
