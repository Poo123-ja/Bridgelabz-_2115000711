import java.util.*;
public class FirstNegetive{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the array size");
int n=sc.nextInt();
int []arr=new int[n];
System.out.println("Enter the elements");
for(int i=0; i<n; i++){
arr[i]=sc.nextInt();
}
int ans=firstNegetive(arr);
if(ans!=-1){
System.out.println("first negetive number is found at index"+ans);
}
else{
System.out.println("Not found");
}
}
public static int firstNegetive(int []arr){
for(int i=0; i<arr.length; i++){
if(arr[i]<0){
return i;
}
}
return -1;
}
}
