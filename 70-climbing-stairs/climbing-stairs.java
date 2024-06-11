class Solution {
    public int climbStairs(int n) {
        //recurrsive
        // if(n==0)return 1;
        // if(n<0)return 0;
        // return climbStairs(n-1)+climbStairs(n-2);
        //Memo
        int dp[]=new int [n+1];
        Arrays.fill(dp,-1);
       return solve(n,dp);
    }
    public int solve(int n, int dp[]){
        if(n==0)return 1;
        if(n<0)return 0;
        if(dp[n]!=-1)return dp[n];
        dp[n] = solve(n-1,dp)+solve(n-2,dp);
        return dp[n];
    }
}