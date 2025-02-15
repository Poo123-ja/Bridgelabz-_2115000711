import java.util.*;
public class FirstAndLastOccurrence {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of elements in the array: ");
int n=sc.nextInt();
int[] arr=new int[n];
System.out.println("Enter the sorted array elements:");
for(int i=0;i<n;i++) {
arr[i]=sc.nextInt();
}
System.out.print("Enter the target element: ");
int target=sc.nextInt();
int first=firstOccurrence(arr,target);
int last=lastOccurrence(arr,target);

if(first==-1) {
System.out.println("Element not found.");
} else {
System.out.println("First occurrence: "+first);
System.out.println("Last occurrence: "+last);
}
}
public static int firstOccurrence(int[] arr,int target) {
int left=0;
int right=arr.length-1;
int result=-1;
while(left<=right) {
int mid=left+(right-left)/2;
if(arr[mid]==target) {
result=mid;
right=mid-1;
} else if(arr[mid]<target) {
left=mid+1;
} else {
right=mid-1;
}
}

return result;
}

public static int lastOccurrence(int[] arr,int target) {
int left=0;
int right=arr.length-1;
int result=-1;

while(left<=right) {
int mid=left+(right-left)/2;
if(arr[mid]==target) {
result=mid;
left=mid+1;
} else if(arr[mid]<target) {
left=mid+1;
} else {
right=mid-1;
}
}

return result;
}
}
