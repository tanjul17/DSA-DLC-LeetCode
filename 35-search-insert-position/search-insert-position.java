class Solution {
    public int searchInsert(int[] arr, int m) {
        int s = 0, e = arr.length - 1, res = arr.length;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] >= m) {
                res = mid; 
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return res; 
    }
}