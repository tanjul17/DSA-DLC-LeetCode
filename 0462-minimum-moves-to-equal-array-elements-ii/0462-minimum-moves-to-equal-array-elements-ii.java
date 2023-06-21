class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;
        int res = 0;
        
        while (start <= end) {
            res +=nums[end]-nums[start];
            start++;
            end--;
        }
        return res;
    }
}
