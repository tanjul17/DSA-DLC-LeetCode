class Solution {
    public int heightChecker(int[] h) {
        int a [] = new int [h.length];
        for(int i=0;i<h.length;i++){
            a[i]=h[i];
        }
        Arrays.sort(a);
        int r=0;
        for(int i=0;i<h.length;i++){
            if(a[i]!=h[i])r++;
        }
        return r;
    }
}