class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            int p = 1;
            for(int j=i;j<nums.length;j++){
                p*=nums[j];
                if(p<k)c++;
                else break;
            }
        }
        return c;
    }
}