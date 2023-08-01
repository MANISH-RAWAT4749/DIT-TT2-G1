public class MinimumCostPathCompute {
    public int minCostPath(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        // Creating a 2D array to store the minimum cost to reach each cell
        int[][] dp = new int[m][n];

        dp[0][0] = grid[0][0];

        // Filling the first row (move only to the right)
        for (int i = 1; i < n; i++) {
            dp[0][i] = dp[0][i - 1] + grid[0][i];
        }

        // Filling the first column (move only downward)
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }

        // Filling the remaining cells
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = grid[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        return dp[m - 1][n - 1]; // Minimum cost to reach the bottom-right cell
    }

    public static void main(String[] args) {
        MinimumCostPathCompute mcp = new MinimumCostPathCompute();
        int[][] grid = {
            {1, 3, 1},
            {2, 1, 1},
            {4, 2, 1}
        }; // Replace this 2D array with your desired grid
        System.out.println("Minimum Cost to reach the destination: " + mcp.minCostPath(grid));
    }
}
