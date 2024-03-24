class Solution {
    public boolean isSubstringPresent(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        for(int i = 0; i < s.length() - 1; i++) {
            String substr = s.substring(i, i + 2);
            if(sb.toString().contains(substr)) {
                return true;
            }
        }
        return false;
    }
}
