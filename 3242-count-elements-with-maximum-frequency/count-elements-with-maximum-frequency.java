class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int m = Integer.MIN_VALUE;
        for(int i : map.values()){
            if(i>m)m = i;
        }
        int r = 0;
        for(int i:map.values()){
            if(i==m)r+=m;
        }
        return r;
    }
}