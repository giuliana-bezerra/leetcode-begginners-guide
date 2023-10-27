import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
  public static void main(String[] args) {
    var solution = new Solution();
    var n = 15;
    System.out.println(solution.fizzBuzz(n));
  }
}

class Solution {
  public List<String> fizzBuzz(int n) {
    var response = new ArrayList<String>();
    for (int i = 1; i <= n; i++) {
      if (i % 3 == 0 && i % 5 == 0)
        response.add("FizzBuzz");
      else if (i % 3 == 0)
        response.add("Fizz");
      else if (i % 5 == 0)
        response.add("Buzz");
      else
        response.add(String.valueOf(i));
    }

    return response;
  }
}