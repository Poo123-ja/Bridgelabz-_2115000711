import java.util.*;
public class PairSum {
public static void main(String[] args) {
int[] arr = {1, 8, 10, 5};
int target = 6;
if (hasPairWithSum(arr, target)) {
System.out.println("Pair with given sum found.");
} else {
System.out.println("No pair with given sum found.");
}
}

public static boolean hasPairWithSum(int[] arr, int target) {
HashMap<Integer, Boolean> visitedNumbers = new HashMap<>();
for (int num : arr) {
int complement = target - num;
if (visitedNumbers.containsKey(complement)) {
return true;
}
visitedNumbers.put(num, true);
}
return false;
}
}
