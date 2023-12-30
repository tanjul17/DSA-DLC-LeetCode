
class Solution {
    public boolean makeEqual(String[] words) {
        int [] hash = new int [26];
        for (String word : words) {
            char[] chars = word.toCharArray();
            for (char c : chars) {
                int i = (int)(c-'a');
                hash[i] = hash[i]+1;
            }
        }

        for (int i=0;i<26;i++) {
            if (hash[i] % words.length != 0) {
                return false;
            }
        }

        return true;
    }
}
