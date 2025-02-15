import java.util.*;
public class PeakElement {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of elements in the array: ");
int n=sc.nextInt();
int[] arr=new int[n];
System.out.println("Enter the elements of the array:");
for(int i=0;i<n;i++) {
arr[i]=sc.nextInt();
}
int peakElement=findPeak(arr);
System.out.println("A peak element is: "+peakElement);
}
public static int findPeak(int[] arr) {
int left=0;
int right=arr.length-1;
while(left<right) {
int mid=left+(right-left)/2;
if((mid==0||arr[mid]>arr[mid-1])&&(mid==arr.length-1||arr[mid]>arr[mid+1])) {
return arr[mid];
}
if(mid>0&&arr[mid-1]>arr[mid]) {
right=mid-1;
} else {
left=mid+1;
}
}

return arr[left];
}
}
