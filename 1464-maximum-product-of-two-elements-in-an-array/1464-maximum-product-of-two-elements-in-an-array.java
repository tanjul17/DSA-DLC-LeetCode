class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        for(int i = 1;i<nums.length;i++){
            max = Math.max(max,(nums[i]-1)*(nums[i-1]-1));
        }
        return max;
    }
}