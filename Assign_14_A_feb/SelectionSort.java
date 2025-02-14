import java.util.*;
public class SelectionSortScores {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of students:");
int n=sc.nextInt();
double[] scores=new double[n];
System.out.println("Enter the exam scores:");
for (int i=0;i<n;i++) {
scores[i]=sc.nextDouble();
}
System.out.println("Original scores:"+Arrays.toString(scores));
selectionSort(scores);
System.out.println("Sorted scores:"+Arrays.toString(scores));
}
public static void selectionSort(double[] scores) {
int n=scores.length;
for (int i=0;i<n-1;i++) {
int minIndex=i;
for (int j=i+1;j<n;j++) {
if (scores[j]<scores[minIndex]) {
minIndex=j;
}
}
swap(scores,i,minIndex);
}
}
private static void swap(double[] scores, int i, int j) {
double temp=scores[i];
scores[i]=scores[j];
scores[j]=temp;
}
}
