class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        HashSet<Integer>set = new HashSet<>();
        int c = 1;
        int mx = 0;
        for(int i : nums){
            set.add(i);
        }
        for(int i : nums){
            if(!set.contains(i-1)){
                c = 1;
                int x = i;
                while(set.contains(x+1)){
                    x++;
                    c++;
                }
                mx = Math.max(mx,c);
            }
        }
        return mx;
    }
}