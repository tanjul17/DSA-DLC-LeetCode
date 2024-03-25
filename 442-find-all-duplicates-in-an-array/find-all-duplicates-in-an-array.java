class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer>set = new HashSet<>();
        List<Integer>res = new ArrayList<>();
        for(int i:nums){
            if(set.contains(i)){
                res.add(i);
            }else{
                set.add(i);
            }
        }
        return res;
    }
}