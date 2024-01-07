class Solution {
    public int splitArray(int[] nums, int k) {
        if (k > nums.length)
            return -1;
        int l = max(nums);
        int h = sum(nums);
        while (l <= h) {
            int m = (l + h) / 2;
            int s = countNum(nums, m);
            if (s > k) {
                l = m + 1;
            } else {
                h = m - 1;
            }
        }
        return h+1; 
    }

    public int countNum(int nums[], int j) {
        int n = nums.length;
        int s = 1, ps = 0;
        for (int i = 0; i < n; i++) {
            if (ps + nums[i] <= j) {
                ps += nums[i];
            } else {
                s++;
                ps = nums[i];
            }
        }
        return s;
    }

    public int sum(int[] nums) {
        int s = 0;
        for (int i = 0; i < nums.length; i++) {
            s += nums[i];
        }
        return s;
    }

    public int max(int[] nums) {
        int s = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            s = Math.max(s, nums[i]);
        }
        return s;
    }
}
