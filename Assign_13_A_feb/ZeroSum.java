import java.util.*;
public class ZeroSum {
public static List<int[]> findAllZeroSumSubarrays(int[] arr) {
List<int[]> result = new ArrayList<>();
HashMap<Integer, List<Integer>> sumMap = new HashMap<>();
int cumulativeSum = 0;
sumMap.put(0, new ArrayList<>());
sumMap.get(0).add(-1);
for (int i = 0; i < arr.length; i++) {
cumulativeSum += arr[i];
if (sumMap.containsKey(cumulativeSum)) {
for (int startIndex : sumMap.get(cumulativeSum)) {
result.add(new int[]{startIndex + 1, i});
}
}
sumMap.computeIfAbsent(cumulativeSum, k -> new ArrayList<>()).add(i);
}
return result;
}

public static void main(String[] args) {
int[] arr = {8, 13, -1, 3, 4, -2, -2, 4, 6, -12, -7};
List<int[]> result = findAllZeroSumSubarrays(arr);
for (int[] subarray : result) {
System.out.println("Subarray found from index " + subarray[0] + " to " + subarray[1]);
}
}
}
