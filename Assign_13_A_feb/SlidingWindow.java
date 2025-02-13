import java.util.*;
public class SlidingWindowMaximum {
public static void main(String[] args) {
int[] nums = {10, -3, -1, 2, 5, 7, 8, 1,-12,10};
int k = 4;
int[] result = maxSlidingWindow(nums, k);
System.out.print("Sliding window maximums: ");
for (int num : result) {
System.out.print(num + " ");
}
}

public static int[] maxSlidingWindow(int[] nums, int k) {
if (nums == null || nums.length == 0 || k <= 0) {
return new int[0];
}
int n = nums.length;
int[] result = new int[n - k + 1];
Deque<Integer> deque = new LinkedList<>();
for (int i = 0; i < n; i++) {
if (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
deque.pollFirst();
}
while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
deque.pollLast();
}
deque.offerLast(i);
if (i >= k - 1) {
result[i - k + 1] = nums[deque.peekFirst()];
}
}
return result;
}


}
