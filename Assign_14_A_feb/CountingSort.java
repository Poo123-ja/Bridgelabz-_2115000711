import java.util.*;
public class CountingSortAges {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of students:");
int n=sc.nextInt();
int[] ages=new int[n];
System.out.println("Enter the ages of the students:");
for (int i=0;i<n;i++) {
ages[i]=scanner.nextInt();
if (ages[i] < 10 || ages[i] > 18) {
System.out.println("Error: Age should be between 10 and 18.");
return;
}
}
System.out.println("Original ages:"+Arrays.toString(ages));
countingSort(ages);
System.out.println("Sorted ages:"+Arrays.toString(ages));
}
public static void countingSort(int[] ages) {
int maxAge=18;
int minAge=10;
int[] count=new int[maxAge-minAge+1];
for (int i=0;i<ages.length;i++) {
count[ages[i]-minAge]++;
}
for (int i=1;i<count.length;i++) {
count[i]+=count[i-1];
}
int[] output=new int[ages.length];
for (int i=ages.length-1;i>=0;i--) {
output[count[ages[i]-minAge]-1]=ages[i];
count[ages[i]-minAge]--;
}
System.arraycopy(output, 0, ages, 0, ages.length);
}
}
