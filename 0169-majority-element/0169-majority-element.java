class Solution {
    public int majorityElement(int[] nums) {
        int count =0, majorityElement =0;
        for(int i = 0;i<nums.length;i++){
            if(count == 0) majorityElement=nums[i];
            if(majorityElement == nums[i])count++;
            else count -=1;
        }
        return majorityElement;
    }
}