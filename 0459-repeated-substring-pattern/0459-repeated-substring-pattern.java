class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String st = s + s; //abababab
        return st.substring(1, s.length() * 2 - 1).contains(s);// abababab.contains(ababa)
    }
}
