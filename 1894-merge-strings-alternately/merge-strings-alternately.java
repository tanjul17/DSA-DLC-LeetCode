class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0, j = 0;
        StringBuilder sb = new StringBuilder();
        
        // Merge alternately until one of the strings is exhausted
        while (i < word1.length() && j < word2.length()) {
            sb.append(word1.charAt(i++));
            sb.append(word2.charAt(j++));
        }
        
        // Append any remaining characters from word1
        while (i < word1.length()) {
            sb.append(word1.charAt(i++));
        }
        
        // Append any remaining characters from word2
        while (j < word2.length()) {
            sb.append(word2.charAt(j++));
        }
        
        return sb.toString();
    }
}
