class Solution {
    public int jump(int[] nums) {
       if (nums.length == 1) return 0; // No jumps needed if there's only one element

    int jumps = 0, l = 0, r = 0;
    
    while (r < nums.length - 1) {
        int farthest = 0;
        for (int i = l; i <= r; i++) {
            farthest = Math.max(farthest, i + nums[i]);
        }
        l = r + 1;
        r = farthest;
        jumps++;
    }
    
    return jumps;
    }
    public static int tabsolve(int []nums){
         int n = nums.length;
        if (n == 1) return 0; // If there's only one element, no jumps are needed

        int[] dp = new int[n];
        dp[0] = 0; // Starting point

        for (int i = 1; i < n; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 0; j < i; j++) {
                if (j + nums[j] >= i && dp[j] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[j] + 1);
                }
            }
        }
        return dp[n - 1];
    }
    public static int memsolve(int[] nums, int i, int[] dp) {
        if (i >= nums.length - 1) {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        }
        int min = Integer.MAX_VALUE;
        for (int j = 1; j <= nums[i]; j++) { // Allow jumping up to nums[i] steps
            int jumps = memsolve(nums, i + j, dp);
            if (jumps != Integer.MAX_VALUE) { // Ensure we do not add infinity
                min = Math.min(min, jumps + 1);
            }
        }
        dp[i] = min;
        return dp[i];
    }
}
