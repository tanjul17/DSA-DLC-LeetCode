class Solution {
    public int pivotInteger(int n) {
        int sum = (n * (n + 1)) / 2;
        int leftSum = 0;
        for (int i = 1; i <= n; i++) {
            leftSum += i;
            if (leftSum == sum - leftSum + i) {
                return i;
            }
        }
        return -1;
    }
}