class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        HashSet<Integer>set = new HashSet<>();
        List<Integer>al = new ArrayList<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i : nums){
            if(map.get(i)>nums.length/3){
                set.add(i);
            }
        }
        for(int i : set){
            al.add(i);
        }
        return al;
    }
}