class Solution {
    public int findMaxLength(int[] nums) {
        int cm = 0, mx = 0;
        HashMap<Integer,Integer>m = new HashMap<>();
        m.put(0,-1);
        for(int i=0;i<nums.length;i++){
            cm += nums[i]==0?-1:1;
            if(m.containsKey(cm)){
                int p = m.get(cm);
                mx = Math.max(mx, i-p);
            }else{
                m.put(cm,i);
            }
        }
        return mx;
    }
}