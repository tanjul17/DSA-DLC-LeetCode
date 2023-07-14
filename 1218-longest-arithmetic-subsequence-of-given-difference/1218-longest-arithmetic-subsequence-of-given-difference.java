class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        int maxCount = 0;
        
        for (int num : arr) {
            int prevNum = num - difference;
            int count = map.getOrDefault(prevNum, 0) + 1;
            map.put(num, count);
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}