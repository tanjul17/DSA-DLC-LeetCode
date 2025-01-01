class Solution {
    public int maxScore(String s) {
        int p [] = new int [s.length()];
        p[0] = s.charAt(0)-'0';
        for(int i=1;i<s.length();i++){
            p[i] = p[i-1]+s.charAt(i)-'0';
        }
        int z = 0;
        int m = Integer.MIN_VALUE;
        for(int i=0;i<s.length()-1;i++){
            int c = s.charAt(i)-'0';
            if(c==0){
                z++;
            }
            m = Math.max(m,z+p[s.length()-1]-p[i]);
        }
        return m;
    }
}