class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        return powerset(nums);
    }
    public static List<List<Integer>> powerset(int a[]) {
        List<List<Integer>> al = new ArrayList<>();
        int n = a.length;
        int s = 1 << n; // Total number of subsets
        for (int i = 0; i < s; i++) {
            ArrayList<Integer> all = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    all.add(a[j]); // Corrected index here
                }
            }
            al.add(all);
        }
        return al;
    }
}
