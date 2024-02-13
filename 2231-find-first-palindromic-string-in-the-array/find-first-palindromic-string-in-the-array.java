class Solution {
    public String firstPalindrome(String[] words) {
        for(String st  : words){
            if(isPalindrome(st)){
                return st;
            }
        }
        return "";
    }
    public boolean isPalindrome(String s){
        int n = s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)!=s.charAt(n-i-1))return false;
        }
        return true;
    }
}