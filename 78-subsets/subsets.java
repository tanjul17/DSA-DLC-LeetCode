class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        subSet(nums,new ArrayList(),0,result);
        return result;
    }
    public void subSet(int[]nums,ArrayList<Integer>cur,int i,List<List<Integer>>result){
        if(i==nums.length){
            result.add(new ArrayList(cur));
            return;
        }
        subSet(nums,cur,i+1,result);
        cur.add(nums[i]);
        subSet(nums,cur,i+1,result);
        cur.remove(cur.size()-1);
    }
}