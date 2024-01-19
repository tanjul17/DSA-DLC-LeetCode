class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int dp[][] = new int [n][m];
        for(int i=0;i<m;i++) dp[0][i] = matrix[0][i];
        for(int i=1;i<n;i++){
            for(int j=0;j<m;j++){
                int min = Integer.MAX_VALUE;
                min = Math.min(min,dp[i-1][j]);
                if(j-1>=0) min = Math.min(min,dp[i-1][j-1]);
                if(j+1<m) min = Math.min(min,dp[i-1][j+1]);

                dp[i][j] = min+matrix[i][j];
            }
        }
        int res = Integer.MAX_VALUE;
        for(int j=0;j<m;j++) res = Math.min(res,dp[n-1][j]);
        return res;
    }
}