class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int s = 0, e = n-1, r1 = -1, r2 = -1;

        // First occurrence
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] == target) {
                r1 = mid;
                e = mid - 1;
            } else if (nums[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        s = 0;
        e = n - 1;

        // Last occurrence
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] == target) {
                r2 = mid;
                s = mid + 1;
            } else if (nums[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return new int[]{r1, r2};
    }
}