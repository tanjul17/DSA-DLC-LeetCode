class Solution {
    int[][] dp;
    
    public int isPalindrome(String s, int i, int j){
        if (i >= j) return 1;
        if (dp[i][j] != -1) return dp[i][j];
        return dp[i][j] = (s.charAt(i) == s.charAt(j)) ? isPalindrome(s, i + 1, j - 1) : 0;
    }
    
    public int countSubstrings(String s) {
        int n = s.length();
        dp = new int[n][n];
        
        // Initialize dp array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                count += isPalindrome(s, i, j);
            }
        }
        return count;
    }
}
