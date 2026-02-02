class Solution {
    public int minimumCost(int[] nums) {
        int f = nums[0];
        int s = Integer.MAX_VALUE, t = Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<s){
                t=s;
                s=nums[i];
            }else if(nums[i]<t)t = nums[i];
        }
        return f+s+t;
    }
}