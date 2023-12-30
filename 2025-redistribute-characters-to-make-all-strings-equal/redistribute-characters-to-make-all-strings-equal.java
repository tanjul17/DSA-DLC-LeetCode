
class Solution {
    public boolean makeEqual(String[] words) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (String word : words) {
            char[] chars = word.toCharArray();
            for (char c : chars) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        for (int c : map.values()) {
            if (c % words.length != 0) {
                return false;
            }
        }

        return true;
    }
}
