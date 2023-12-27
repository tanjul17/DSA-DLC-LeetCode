class Solution {
    public int searchInsert(int[] arr, int m) {
        int s = 0, e = arr.length - 1, res = -1;

        if (m < arr[0]) {
            return 0;
        }

        if (m > arr[arr.length - 1]) {
            return arr.length;
        }

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == m) {
                return mid;
            } else if (arr[mid] > m) {
                res = mid; // Update the result but continue searching in the left half
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return res; // Return the final result
    }
}