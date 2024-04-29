class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0, r = 0,maxlen = 0,z = 0;
        while(r<nums.length){
            if(nums[r]==0)z++;
            if(z>k){
                if(nums[l]==0)z--;
                l++;
            }
            if(z<=k){
                maxlen = Math.max(maxlen,r-l+1);
            }
            r++;
        }
        return maxlen;
    }
}