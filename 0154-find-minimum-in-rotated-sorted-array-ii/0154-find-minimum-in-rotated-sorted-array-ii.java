class Solution {
    public int findMin(int[] nums) {
        HashSet<Integer>set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
        }
        Arrays.sort(nums);
        return nums[0];
    }
}