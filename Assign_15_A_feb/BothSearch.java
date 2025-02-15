import java.util.*;
public class SearchChallenge {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of elements in the list: ");
int n=sc.nextInt();
int[] arr=new int[n];
System.out.println("Enter the elements of the list:");
for(int i=0;i<n;i++) {
arr[i]=sc.nextInt();
}
int firstMissingPositive=findFirstMissingPositive(arr);
System.out.println("The first missing positive integer is: "+firstMissingPositive);
Arrays.sort(arr);
System.out.print("Enter the target number for binary search: ");
int target=sc.nextInt();
int targetIndex=binarySearch(arr,target);
System.out.println("The target number is at index: "+targetIndex);
}
public static int findFirstMissingPositive(int[] arr) {
int n=arr.length;
for(int i=0;i<n;i++) {
while(arr[i]>0&&arr[i]<=n&&arr[arr[i]-1]!=arr[i]) {
int temp=arr[i];
arr[i]=arr[temp-1];
arr[temp-1]=temp;
}
}
for(int i=0;i<n;i++) {
if(arr[i]!=i+1) {
return i+1;
}
}
return n+1;
}
public static int binarySearch(int[] arr,int target) {
int left=0;
int right=arr.length-1;
while(left<=right) {
int mid=left+(right-left)/2;
if(arr[mid]==target) {
return mid;
} else if(arr[mid]<target) {
left=mid+1;
} else {
right=mid-1;
}
}
return -1;
}
}
