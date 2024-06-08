class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        if (nums.length < 2) return false;

        // HashMap to store the remainder of the cumulative sum and its index
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // Initialize with remainder 0 at index -1

        int cumulativeSum = 0;
        for (int i = 0; i < nums.length; i++) {
            cumulativeSum += nums[i];
            int remainder = cumulativeSum % k;

            // Adjust remainder to be positive if it's negative
            if (remainder < 0) {
                remainder += k;
            }

            // If this remainder has been seen before
            if (map.containsKey(remainder)) {
                // Check if the subarray length is at least 2
                if (i - map.get(remainder) > 1) {
                    return true;
                }
            } else {
                // Otherwise, store the remainder and its index
                map.put(remainder, i);
            }
        }

        return false;
    }
}
/*
94 Cases run:
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        if (nums.length < 2) return false;

        if (nums.length == 2) {
            if ((nums[0] + nums[1]) % k == 0) {
                return true;
            } else {
                return false;
            }
        }

        for (int i = 0; i < nums.length - 1; i++) {
            int s = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                s += nums[j];
                if (s % k == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
 */