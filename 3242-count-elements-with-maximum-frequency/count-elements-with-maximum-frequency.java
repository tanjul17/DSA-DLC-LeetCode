import java.util.HashMap;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        
        for (int i : nums) {
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }

        int maxFrequency = 0;
        
        for (int v : mp.values()) {
            maxFrequency = Math.max(v, maxFrequency);
        }

        int c = 0;
        
        for (int v : mp.values()) {
            if (maxFrequency == v) {
                c += v;
            }
        }

        return c;
    }
}
