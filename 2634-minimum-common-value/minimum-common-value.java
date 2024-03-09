class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer>set = new HashSet<>();
        for(int i : nums1){
            set.add(i);
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                min = Math.min(min,nums2[i]);
            }
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
}