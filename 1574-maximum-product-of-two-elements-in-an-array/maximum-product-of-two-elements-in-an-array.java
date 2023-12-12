class Solution {
    public int maxProduct(int[] nums) {
        int p = 1;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int i = 0; i < nums.length; i++) {
            pq.add(nums[i]);
            if (pq.size() > 2) {
                pq.poll(); 
            }
        }
        
        while (!pq.isEmpty()) {
            p *= (pq.poll() - 1);
        }
        
        return p;
    }
}
