class Solution {
    public int maxSubArray(int[] nums) {
        int ms = Integer.MIN_VALUE;
        int cm = 0;
        for(int i = 0;i<nums.length;i++){
            cm+=nums[i];
            ms = Math.max(ms,cm);
            if(cm<0)cm = 0;
        }
        return ms;
    }
}