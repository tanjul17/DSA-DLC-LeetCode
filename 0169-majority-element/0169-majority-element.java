class Solution {
    public int majorityElement(int[] nums) {
        // int count =0, majorityElement =0;
        // for(int i = 0;i<nums.length;i++){
        //     if(count == 0) majorityElement=nums[i];
        //     if(majorityElement == nums[i])count++;
        //     else count -=1;
        // }
        // return majorityElement;
        //O(n)
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }
        int halfSize = nums.length / 2;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            if (value > halfSize) {
                return entry.getKey();
            }
        }
        return 0;
    }
}