class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int n = str1.length(), m = str2.length();
        if(!str1.concat(str2).equals(str2.concat(str1))){
            return "";
        }
        int len = gcd(n,m);
        return str1.substring(0,len);
    }
    public int gcd(int x,int y){
        if(y==0) return x;
        else return gcd(y,x%y);
    }
}
