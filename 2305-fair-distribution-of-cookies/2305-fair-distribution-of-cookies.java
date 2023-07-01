class Solution {
    public int distributeCookies(int[] cookies, int k) {
        int[] childs = new int[k];
        return minUnfairness(0, cookies, childs);
    }

    public int minUnfairness(int i, int[] cookies, int[] childs) {
        if (i == cookies.length) {
            int ans = 0;
            for (int c : childs)
                ans = Math.max(ans, c);
            return ans;
        }
        int ans = Integer.MAX_VALUE;
        int c = childs.length;
        for (int j = 0; j < c; j++) {
            childs[j] += cookies[i];
            ans = Math.min(ans, minUnfairness(i + 1, cookies, childs));
            childs[j] -= cookies[i];
        }
        return ans;
    }
}
