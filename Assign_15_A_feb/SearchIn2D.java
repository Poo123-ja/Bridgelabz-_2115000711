import java.util.*;
public class SearchIn2D {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of rows: ");
int rows=sc.nextInt();
System.out.print("Enter the number of columns: ");
int cols=sc.nextInt();
int[][] matrix=new int[rows][cols];
System.out.println("Enter the elements of the matrix:");
for(int i=0;i<rows;i++) {
for(int j=0;j<cols;j++) {
matrix[i][j]=sc.nextInt();
}
}
System.out.print("Enter the target value to search for: ");
int target=sc.nextInt();
boolean found=searchMatrix(matrix,target);
System.out.println("Target found: "+found);
}
public static boolean searchMatrix(int[][] matrix,int target) {
int rows=matrix.length;
int cols=matrix[0].length;
int left=0;
int right=rows*cols-1;
while(left<=right) {
int mid=left+(right-left)/2;
int midElement=matrix[mid/cols][mid%cols];
if(midElement==target) {
return true;
} else if(midElement<target) {
left=mid+1;
} else {
right=mid-1;
}
}
return false;
}
}
