import java.util.*;
public class Rotation{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of elements in the array: ");
int n = sc.nextInt();
int[] arr = new int[n];

System.out.println("Enter the elements of the rotated sorted array:");
for (int i = 0; i < n; i++) {
arr[i] = sc.nextInt();
}

int rotationIndex = RotationPoint(arr);
System.out.println("The rotation point is at index: " + rotationIndex);
}

public static int RotationPoint(int[] arr) {
int left = 0;
int right = arr.length - 1;

while (left < right) {
int mid = left + (right - left) / 2;

if (arr[mid] > arr[right]) {
left = mid + 1;
} else {
right = mid;
}

}

return left;
}
}
