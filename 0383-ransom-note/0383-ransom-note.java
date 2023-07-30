class Solution {
    public boolean canConstruct(String r, String m) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char c : r.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for (char c : m.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        for (char c : map1.keySet()) {
            int rc = map1.get(c);
            int mc = map2.getOrDefault(c,0);
            if(rc>mc){
                return false;
            }
        }
        return true;
    }
}
