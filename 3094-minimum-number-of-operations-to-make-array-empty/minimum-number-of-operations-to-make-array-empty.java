class Solution {
    public int minOperations(int[] nums) {
        Map<Integer, Integer> hsh = new HashMap<>();

        for (int num : nums) {
            hsh.put(num, hsh.getOrDefault(num, 0) + 1);
        }

        int c = 0;
        for (Map.Entry<Integer, Integer> e : hsh.entrySet()) {
            int val = e.getValue();
            while (val > 0) {
                if (val == 1) return -1;
                else if (val == 4 || val == 2) {
                    val -= 2;
                    c += 1;
                } else {
                    val -= 3;
                    c += 1;
                }
            }
        }
        return c;
    }
}