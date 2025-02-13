import java.util.*;
public class LongestConsecutive {
public static void main(String[] args) {
int[] nums = {100, 40, 200, 1,300,6, 20};
System.out.println("Longest Consecutive Sequence Length: " + longestConsecutive(nums));
}

public static int longestConsecutive(int[] nums) {
if (nums.length == 0) return 0;
HashSet<Integer> numSet = new HashSet<>();
for (int num : nums) {
numSet.add(num);
}
int longestStreak = 0;
for (int num : numSet) {
if (!numSet.contains(num - 1)) {
int currentNum = num;
int currentStreak = 1;
while (numSet.contains(currentNum + 1)) {
currentNum++;
currentStreak++;
}
longestStreak = Math.max(longestStreak, currentStreak);
}
}
return longestStreak;
}
}

