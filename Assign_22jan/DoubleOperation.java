import java.util.Scanner;
class DoubleOperation{
        public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        double a=sc.nextInt();
        double b=sc.nextInt();
        double c=sc.nextInt();

        double result1=a+b*c;
        double result2=a*b+c;
        double result3=c+a/b;
        double result4=a%b+c;

        System.out.println("The results of Double Operations are" + result1 + "," +result2 +"," +result3+  "and" +result4);

}
}







