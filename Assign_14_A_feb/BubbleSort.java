import java.util.*;
public class BubbleSort {
public static void main(String[] args) {
int[] studentMarks = {80, 67, 91, 65, 92, 83, 76};
System.out.println("Original marks: " + Arrays.toString(studentMarks));
bubbleSort(studentMarks);
System.out.println("Sorted marks: " + Arrays.toString(studentMarks));
}

public static void bubbleSort(int[] marks) {
int n = marks.length;
boolean swapped;
for (int i = 0; i < n - 1; i++) {
swapped = false;
for (int j = 0; j < n - i - 1; j++) {
if (marks[j] > marks[j + 1]) {
int temp = marks[j];
marks[j] = marks[j + 1];
marks[j + 1] = temp;
swapped = true;
}
}
if (!swapped) {
break;
}
}
}

}
