class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int e = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0)e++;
        }
        return e>=2;
    }
}