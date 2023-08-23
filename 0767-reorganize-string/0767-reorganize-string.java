class Solution {
    public String reorganizeString(String S) {
        int[] h = new int[26];
        for (int i = 0; i < S.length(); i++) {
            h[S.charAt(i) - 'a']++;
        } 
        int max = 0, letter = 0;
        for (int i = 0; i < h.length; i++) {
            if (h[i] > max) {
                max = h[i];
                letter = i;
            }
        }
        if (max > (S.length() + 1) / 2) {
            return ""; 
        }
        char[] res = new char[S.length()];
        int idx = 0;
        while (h[letter] > 0) {
            res[idx] = (char) (letter + 'a');
            idx += 2;
            h[letter]--;
        }
        for (int i = 0; i < h.length; i++) {
            while (h[i] > 0) {
                if (idx >= res.length) {
                    idx = 1;
                }
                res[idx] = (char) (i + 'a');
                idx += 2;
                h[i]--;
            }
        }
        return String.valueOf(res);
    }
}