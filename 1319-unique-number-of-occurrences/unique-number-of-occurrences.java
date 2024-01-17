import java.util.HashMap;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        // Count occurrences of each element
        for (int i : arr) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        
        // Check if occurrences are unique
        HashSet<Integer> occurrencesSet = new HashSet<>(hm.values());
        return occurrencesSet.size() == hm.size();
    }
}
