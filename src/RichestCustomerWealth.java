public class RichestCustomerWealth {
  public static void main(String[] args) {
    var solution = new Solution();
    int[][] accounts = { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 } };

    System.out.println(solution.maximumWealth(accounts));
  }
}

class Solution {
  public int maximumWealth(int[][] accounts) {
    var maxWealth = 0;
    for (int i = 0; i < accounts.length; i++) {
      var customerWealth = 0;
      for (int j = 0; j < accounts[i].length; j++) {
        customerWealth += accounts[i][j];
      }

      if (maxWealth < customerWealth)
        maxWealth = customerWealth;
    }

    return maxWealth;
  }
}