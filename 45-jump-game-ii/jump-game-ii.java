// class Solution {
//     public int jump(int[] nums) {
//         // int n = nums.length;
//         // int dp[] = new int[n + 1];
//         // dp[0] = 0;
//         // dp[1] = nums[0];
//         // for (int i = 2; i <= n; i++) {
//         //     int j = 0;
//         //     if (i + j < n) {
//         //         for (; j <= nums[i]; j++) {
//         //             dp[i] = Math.min(dp[i - 1], nums[i - 1] + dp[i - 2]);
//         //         }

//         //     }
//         // }
//         // return dp[n];
//         int dp[] = new int [nums.length+1];
//         for(int i=0;i<nums.length+1;i++){
//             dp[i] = -1;
//         }
//         return memsolve(nums,0,0,dp);
//     }

//     public static int memsolve(int[] nums, int i, int jump, int dp[]) {
//         if (i >= nums.length - 1) {
//             return jump;
//         }
//         if (dp[i] != -1) {
//             return dp[i];
//         }
//         int min = Integer.MAX_VALUE;
//         for (int j = 1; j <= nums[i]; j++) { // Allow jumping up to nums[i] steps
//             min = Math.min(min, memsolve(nums, i + j, jump + 1, dp));
//         }
//         dp[i] = min;
//         return dp[i];
//     }
// }
class Solution {
    public int jump(int[] nums) {
        int dp[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            dp[i] = -1;
        }
        return memsolve(nums, 0, dp);
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
