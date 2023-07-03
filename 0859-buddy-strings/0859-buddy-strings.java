class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        
        if (s.equals(goal)) {
            HashSet<Character> set = new HashSet<>();
            for (char c : s.toCharArray()) {
                set.add(c);
            }
            return set.size() < s.length();
        }
        
        List<Integer> dif = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                dif.add(i);
            }
        }
        
        return dif.size() == 2 && s.charAt(dif.get(0)) == goal.charAt(dif.get(1)) && goal.charAt(dif.get(0)) == s.charAt(dif.get(1));
    }
}
