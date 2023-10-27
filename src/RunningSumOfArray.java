import java.util.Arrays;

public class RunningSumOfArray {
  public static void main(String[] args) {
    var solution = new Solution();
    int[] nums = { 3, 1, 2, 10, 1 };
    System.out.println(Arrays.toString(solution.runningSum(nums)));
  }
}

class Solution {
  public int[] runningSum(int[] nums) {
    var sum = 0;
    int[] runningSum = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      runningSum[i] = sum;
    }
    return runningSum;
  }
}