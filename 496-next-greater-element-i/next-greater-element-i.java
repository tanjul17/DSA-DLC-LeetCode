class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length]; 
        Map<Integer, Integer> hm = new HashMap<>(); 
        Stack<Integer> s = new Stack<>();

        for (int num : nums2) {
            while (!s.isEmpty() && s.peek() < num) {
                hm.put(s.pop(), num);
            }
            s.push(num);
        }
        for (int i = 0; i < nums1.length; i++) {
            res[i] = hm.getOrDefault(nums1[i], -1);  
        }
        return res;
    }
}
