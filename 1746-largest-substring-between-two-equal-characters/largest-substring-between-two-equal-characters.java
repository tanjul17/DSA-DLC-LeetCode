class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] hash = new int[26];
        Arrays.fill(hash, -1);

        char[] c = s.toCharArray();
        int mx = -1;

        for (int i = 0; i < c.length; i++) {
            int idx = c[i] - 'a';

            if (hash[idx] == -1) {
                hash[idx] = i;
            } else {
                mx = Math.max(mx, i - hash[idx] - 1);
            }
        }
        return mx;
    }
}
