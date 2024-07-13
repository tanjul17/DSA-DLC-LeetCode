import java.util.TreeMap;
import java.util.Map;

class Solution {
    public int findLHS(int[] nums) {
        int ans = 0;
        TreeMap<Integer, Integer> m = new TreeMap<>();
        // Fill the map with frequency of each number
        for (int i : nums) {
            m.put(i, m.getOrDefault(i, 0) + 1);
        }
        // Iterate through the map entries
        for (Map.Entry<Integer, Integer> e : m.entrySet()) {
            int key = e.getKey();
            int value = e.getValue();
            // Check if there is a consecutive number in the map
            if (m.containsKey(key + 1)) {
                // Calculate the length of harmonious subsequence
                ans = Math.max(ans, value + m.get(key + 1));
            }
        }
        return ans;
    }
}
