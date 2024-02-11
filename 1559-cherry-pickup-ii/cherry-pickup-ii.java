class Solution {
    public int cherryPickup(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int[][][] dp = new int[n + 1][m + 1][m + 1];

        for (int i = 0; i <dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                for (int k = 0; k < dp[i][j].length; k++) {
                    dp[i][j][k] = -1;
                }
            }
        }
        return solve(grid,0,0,m-1,dp);
    }
   public int solve(int grid[][], int i, int r1, int r2, int dp[][][]) {
        int n = grid.length, m = grid[0].length;
        //BC
        if (i == n) return 0;
        //BC
        if (r1 < 0 || r2 < 0 || r1 >= m || r2 >= m) return Integer.MIN_VALUE;
        //BC
        if (dp[i][r1][r2] != -1) return dp[i][r1][r2];

        int res = 0;
        //for rob 1
        res += grid[i][r1];
        //if both value are not same than add --> BC
        if (r1 != r2) res += grid[i][r2];

        int mx = 0;

        for (int moveR1 = -1; moveR1 <= 1; moveR1++) {
            for (int moveR2 = -1; moveR2 <= 1; moveR2++) {
                mx = Math.max(mx, solve(grid, i + 1, r1 + moveR1, r2 + moveR2, dp));
            }
        }

        res += mx;

        dp[i][r1][r2] = res;

        return res;
    }
}