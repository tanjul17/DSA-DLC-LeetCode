class Solution {
    public int fib(int n) {
       int dp[] = new int[n + 2];
        dp[0] = 0;
        dp[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];

//    return (int) (Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));

    }
}