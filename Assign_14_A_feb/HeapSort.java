import java.util.*;
public class HeapSortSalaries {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of job applicants:");
int n=sc.nextInt();
double[] salaries=new double[n];
System.out.println("Enter the expected salary demands:");
for (int i=0;i<n;i++) {
salaries[i]=sc.nextDouble();
}
System.out.println("Original salaries:"+Arrays.toString(salaries));
heapSort(salaries);
System.out.println("Sorted salaries:"+Arrays.toString(salaries));
}
public static void heapSort(double[] salaries) {
int n=salaries.length;
for (int i=n/2-1;i>=0;i--) {
heapify(salaries,n,i);
}
for (int i=n-1;i>0;i--) {
swap(salaries,0,i);
heapify(salaries,i,0);
}
}
private static void heapify(double[] salaries, int n, int i) {
int largest=i;
int left=2*i+1;
int right=2*i+2;
if (left<n&&salaries[left]>salaries[largest]) {
largest=left;
}
if (right<n&&salaries[right]>salaries[largest]) {
largest=right;
}
if (largest!=i) {
swap(salaries,i,largest);
heapify(salaries,n,largest);
}
}
private static void swap(double[] salaries, int i, int j) {
double temp=salaries[i];
salaries[i]=salaries[j];
salaries[j]=temp;
}
}
