class Solution {
    public int strangePrinter(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return solve(0, n - 1, s, dp);
    }

    public int solve(int i, int j, String s, int[][] dp) {
        if (i == j) {
            return 1;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int minT = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int left = solve(i, k, s, dp);
            int right = solve(k + 1, j, s, dp);
            int currentT = (s.charAt(i) == s.charAt(j)) ? left + right - 1 : left + right;
            minT = Math.min(minT, currentT);
        }
        dp[i][j] = minT;
        return dp[i][j];
    }
}
