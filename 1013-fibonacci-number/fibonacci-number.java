class Solution {
    public int fib(int n) {
        if(n<=1)return n;
        int p = 1, p2 = 0;
        for(int i=2;i<=n;i++){
            int curi = p2+p;
            p2 = p;
            p = curi;
        }
        return p;
    }
}//space optimized