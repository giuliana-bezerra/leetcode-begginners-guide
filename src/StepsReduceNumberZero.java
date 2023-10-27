public class StepsReduceNumberZero {
  public static void main(String[] args) {
    int num = 123;

    System.out.println(new Solution().numberOfSteps(num));
  }
}

class Solution {
  public int numberOfSteps(int num) {
    var count = 0;
    while (num > 0) {
      if (num % 2 == 0)
        num /= 2;
      else
        num--;
      count++;
    }
    return count;
  }
}
