class Solution {
    public List<Integer> partitionLabels(String s) {
        int lastidx [] = new int[26];
        for(int i=0;i<s.length();i++){
            lastidx[s.charAt(i)-'a']=i;
        }   
        int ps = 0, pe = 0;
        List<Integer>res = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            pe = Math.max(pe,lastidx[s.charAt(i)-'a']);
            if(i==pe){
                res.add(i-ps+1);
                ps=i+1;
            }
        }
        return res;
    }
}