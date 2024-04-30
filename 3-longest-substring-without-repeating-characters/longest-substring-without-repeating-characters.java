class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> lastIndex = new HashMap<>();
        int size = s.length();
        int i = 0, ans = 0;
        for (int j = 0; j < size; j++) {
            if (lastIndex.containsKey(s.charAt(j))) {
                i = Math.max(i, lastIndex.get(s.charAt(j)) + 1);
            }
            lastIndex.put(s.charAt(j), j);
            ans = Math.max(ans, j - i + 1);
        }
        return ans;
    }
}
