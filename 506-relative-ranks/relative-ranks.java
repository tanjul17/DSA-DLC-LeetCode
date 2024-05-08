class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] res = new String[n];
        Map<Integer, Integer> rankMap = new HashMap<>();
        int[] cloneScores = score.clone();
        Arrays.sort(cloneScores);
        for (int i = 0; i < n; i++) {
            rankMap.put(cloneScores[i], n - i);
        }
        for (int i = 0; i < n; i++) {
            int rank = rankMap.get(score[i]);
            if (rank == 1) {
                res[i] = "Gold Medal";
            } else if (rank == 2) {
                res[i] = "Silver Medal";
            } else if (rank == 3) {
                res[i] = "Bronze Medal";
            } else {
                res[i] = String.valueOf(rank);
            }
        }
        return res;
    }
}
