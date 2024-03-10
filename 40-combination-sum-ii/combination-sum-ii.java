class Solution {
    public List<List<Integer>> combinationSum2(int[] con, int t) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        Arrays.sort(con);
        comb(0, con, t, res, ds);
        return res;
    }

    public void comb(int ids, int[] con, int t, List<List<Integer>> res, List<Integer> ds) {
        if (t == 0) {
            res.add(new ArrayList<>(ds));
            return;
        }
        for (int i = ids; i < con.length; i++) {
            if (i > ids && con[i] == con[i - 1]) continue; 
            if (con[i] > t) break;
            ds.add(con[i]);
            comb(i + 1, con, t - con[i], res, ds);
            ds.remove(ds.size() - 1);
        }
    }
}
