class Solution {
    public int findMaxK(int[] nums) {
        int max = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                int r = Math.abs(nums[i]+nums[j]);
                if(r==0) max = Math.max(max, Math.abs(nums[i]));
            }
        }
        return max==0?-1:max;
    }
}