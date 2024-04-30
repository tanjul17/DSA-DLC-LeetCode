class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int size=s.length();
        int j=0;
        int i=0;
        if(size==1 || size==0) return size;
        int ans=1;
        while(j<size){
            if(hm.containsKey(s.charAt(j)) && hm.get(s.charAt(j))>=i){
                i=hm.get(s.charAt(j));
                i++;   
            }
            
            hm.put(s.charAt(j),j);
            ans=Math.max(ans,j-i+1);
            
            j++;
        }
        return ans;
    }
}