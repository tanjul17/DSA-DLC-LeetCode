class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] a = new int[n];
        
        if (k == 0) {
            // If k is 0, the decrypted code is an array of zeros
            for (int i = 0; i < n; i++) {
                a[i] = 0;
            }
        } else if (k > 0) {
            // If k is positive, sum the next k elements
            for (int i = 0; i < n; i++) {
                int s = 0;
                for (int j = 1; j <= k; j++) {
                    s += code[(i + j) % n];
                }
                a[i] = s;
            }
        } else {
            // If k is negative, sum the previous |k| elements
            for (int i = 0; i < n; i++) {
                int s = 0;
                for (int j = 1; j <= -k; j++) {
                    s += code[(i - j + n) % n];
                }
                a[i] = s;
            }
        }
        
        return a;
    }
}
