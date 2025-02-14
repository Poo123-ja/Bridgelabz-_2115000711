import java.util.*;
public class InsertionSort {
public static void main(String[] args) {
int[] employeeIDs = {109, 12, 100, 1, 8, 10};
System.out.println("Unsorted Employee IDs: " + Arrays.toString(employeeIDs));
insertionSort(employeeIDs);
System.out.println("Sorted Employee IDs: " + Arrays.toString(employeeIDs));
}
public static void insertionSort(int[] employeeIDs) {
int n = employeeIDs.length;
for (int i = 1; i < n; i++) {
int key = employeeIDs[i];
int j = i - 1;
while (j >= 0 && employeeIDs[j] > key) {
employeeIDs[j + 1] = employeeIDs[j];
j = j - 1;
}
employeeIDs[j + 1] = key;
}
}
}
