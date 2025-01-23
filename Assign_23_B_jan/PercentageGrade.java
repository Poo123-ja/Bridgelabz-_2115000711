import java.util.Scanner;
class PercentageGrade{
	public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	int maths=sc.nextInt();
	int chemistry=sc.nextInt();
	int physics=sc.nextInt();
	double Percentage=(maths+chemistry+physics)/3;
	if(Percentage>=80)
	System.out.println("Percentage Calculated: "+ Percentage +" Level: 4 and Remarks : Above agency-normalization standards");
	else if(Percentage >= 70 && Percentage <=79)
        System.out.println("Percentage Calculated: "+ Percentage +" Level: 3 and Remarks : at agency-normalization standards");
	else if(Percentage >= 60 && Percentage >=69)
        System.out.println("Percentage Calculated: "+ Percentage +" Level: 2 and Remarks : Below but approaching agency-normalization standards");
	else if(Percentage >= 50 && Percentage <=59)
        System.out.println("Percentage Calculated: "+ Percentage +" Level: 1 and Remarks : well below agency-normalization standards");
	else if(Percentage >= 40 && Percentage <=49)
        System.out.println("Percentage Calculated: "+ Percentage +" Level: 1 and Remarks : too below agency-normalization standards");
	else
	System.out.println("Percentage Calculated: "+ Percentage +" Level: 4 and Remarks : remidial standards");
}
}
