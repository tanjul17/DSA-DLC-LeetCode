class Solution {
     public int sumSubarrayMins(int[] arr) {
        final int modulo = 1_000_000_007;

        int[] stack = new int[arr.length + 1];
        int idxStack = 0;

        int[] dp = new int[arr.length];
        dp[0] = arr[0];

        long res = dp[0];
        for (int i = 1; i < arr.length; i++) {
            while (idxStack >= 0 && arr[stack[idxStack]] >= arr[i]) idxStack--;//pop
            dp[i] = idxStack < 0 ? arr[i] * (i + 1) : dp[stack[idxStack]] + arr[i] * (i - stack[idxStack]);
            res += dp[i];
            stack[++idxStack] = i;//push
        }

        return (int) (res % modulo);
    }
}
//     public int sumSubarrayMins(int[] numbers) {
//         int ts = 0;
//         int s = 0;
//         int mod = 1000000009;

//         for (int i = 0; i < numbers.length; i++) {
//             int start = i;
//             int m = Integer.MAX_VALUE; 
//             for (int j = i; j < numbers.length; j++) {
//                 int end = j;
//                 for (int k = start; k <= end; k++) {
//                     m = Math.min(m, numbers[k]);
//                 }
//                 s =(s+m)%mod;
//                 ts++;
//             }
//         }
//         return s;
//     }
// }
