class Solution {
    public boolean isValid(int ni, int nj, int n) {
        return ni >= 0 && nj >= 0 && ni < n && nj < n;
    }

    public double knightProbability(int n, int k, int r, int c) {
        double[][] cur = new double[n][n];
        double[][] next = new double[n][n];
        cur[r][c] = 1;

        int[][] moves = { { -2, 1 }, { -1, 2 }, { 1, 2 }, { 2, 1 }, { 2, -1 }, { 1, -2 }, { -1, -2 }, { -2, -1 } };
        for (int m = 1; m <= k; m++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (cur[i][j] != 0) {
                        for (int move = 0; move < moves.length; move++) {
                            int ni = i + moves[move][0];
                            int nj = j + moves[move][1];
                            if (isValid(ni, nj, n)) {
                                next[ni][nj] += cur[i][j] / 8.0;
                            }
                        }
                    }
                }
            }
            cur = next;
            next = new double[n][n];
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += cur[i][j];
            }
        }
        return sum;
    }
}
