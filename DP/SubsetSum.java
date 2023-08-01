public class SubsetSum {
    public boolean isSubsetSum(int[] nums, int sum) {
        int n = nums.length;
        boolean[][] dp = new boolean[n + 1][sum + 1];

        // Initializing the base cases
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        // Filling the dp table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (nums[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][sum];
    }

    public static void main(String[] args) {
        SubsetSum ss = new SubsetSum();
        int[] nums = {3, 34, 4, 12, 5, 2}; // Replace this array with the desired set of numbers
        int sum = 9; // Replace 9 with the desired sum
        System.out.println(ss.isSubsetSum(nums, sum));
    }
}
