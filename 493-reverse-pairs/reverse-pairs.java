import java.util.ArrayList;

class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    public int mergeSort(int[] nums, int l, int r) {
        if (l >= r) {
            return 0;
        }
        int m = l + (r - l) / 2;
        int count = mergeSort(nums, l, m) + mergeSort(nums, m + 1, r);
        count += merge(nums, l, m, r);
        return count;
    }

    public int merge(int[] nums, int l, int m, int r) {
        int count = 0;
        int j = m + 1;
        
        // Count important reverse pairs
        for (int i = l; i <= m; i++) {
            while (j <= r && nums[i] > 2L * nums[j]) {
                j++;
            }
            count += j - (m + 1);
        }

        // Merge step
        ArrayList<Integer> temp = new ArrayList<>();
        int i = l;
        j = m + 1;
        
        while (i <= m && j <= r) {
            if (nums[i] <= nums[j]) {
                temp.add(nums[i++]);
            } else {
                temp.add(nums[j++]);
            }
        }
        
        while (i <= m) {
            temp.add(nums[i++]);
        }
        
        while (j <= r) {
            temp.add(nums[j++]);
        }
        
        for (int k = l; k <= r; k++) {
            nums[k] = temp.get(k - l);
        }

        return count;
    }
}
