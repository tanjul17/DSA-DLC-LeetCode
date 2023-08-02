class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>res = new ArrayList<>();
        List<Integer>tempList = new ArrayList<>();

        Arrays.sort(nums);
        subset(res,tempList,0,nums);
        return res;
    }
    public void subset(List<List<Integer>>res,List<Integer>tempList,int start,int nums[]){
        res.add(new ArrayList<>(tempList));
        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1]) continue;
            tempList.add(nums[i]);
            subset(res,tempList,i+1,nums);
            tempList.remove(tempList.size()-1);
        }
    }
}