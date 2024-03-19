class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for (char c : tasks) {
            freq[c - 'A']++;
        }
        Arrays.sort(freq);
        int maxFreq = freq[25] - 1;
        int idleTime = maxFreq * n;
        for (int i = 24; i >= 0; i--) {
            idleTime -= Math.min(maxFreq, freq[i]);
        }
        return Math.max(0, idleTime) + tasks.length;
    }
}
