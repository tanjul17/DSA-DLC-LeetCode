class Solution {
    public int countPartitions(int[] nums) {
        int s = 0;
        for (int x : nums) s += x;
        if (s % 2 != 0) return 0;   
        return nums.length-1;       
    }
}
