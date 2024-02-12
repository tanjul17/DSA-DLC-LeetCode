class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>m = new HashMap<>();
        for(int i:nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        int hf = nums.length/2;
        for(Map.Entry<Integer,Integer>e : m.entrySet()){
            int v = e.getValue();
            if(v>hf){
                return e.getKey();
            }
        }
        return 0;
    }
}