import java.util.Scanner;
class Fahrenheit{
        public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        double farenheit = sc.nextDouble();
        double celciusResult = (farenheit-32)*5/9;
        System.out.println("The" + farenheit +  "fahrenheit is" + celciusResult + "celsius");
}
}




