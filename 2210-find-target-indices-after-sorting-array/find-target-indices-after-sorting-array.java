import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int s = 0, e = nums.length - 1;
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                res.add(i);
            }
        }
        return res;
    }
}
