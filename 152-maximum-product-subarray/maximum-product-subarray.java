class Solution {
    public int maxProduct(int[] nums) {
        int res = Integer.MIN_VALUE, fp = 1, bp = 1;
        for(int i=0;i<nums.length;i++){
            fp *= nums[i];
            bp *= nums[nums.length-i-1];
            res = Math.max(res,Math.max(fp,bp));
            if(fp==0)fp=1;
            if(bp==0)bp=1;
        }
        return res;
    }
}