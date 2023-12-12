class Solution {
    public void nextPermutation(int[] nums) {
        int idx = -1;
        int n = nums.length;
        
        // Find the first element (idx) from the right that is smaller than its next element basically the break point.
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                idx = i;
                break;
            }
        }
        
        // edge case :If no such element is found, reverse the whole array
        if (idx == -1) {
            reverse(nums, 0, n - 1);
            return;
        }
        
        // Find the smallest element to the right of idx that is greater than nums[idx] and swap it
        for (int i = n - 1; i > idx; i--) {
            if (nums[i] > nums[idx]) {
                // Swap nums[idx] and nums[i]
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
                break;
            }
        }
        
        // Reverse the subarray to the right of idx
        reverse(nums, idx + 1, n - 1);
    }

    public void reverse(int[] a, int start, int end) {
        while (start < end) {
            // Swap elements at start and end indices
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;

            // Move indices towards each other
            start++;
            end--;
        }
    }
}
