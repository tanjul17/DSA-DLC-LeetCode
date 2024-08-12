class KthLargest {
    private int k;
    private PriorityQueue<Integer>heap;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.heap = new PriorityQueue<Integer>();
        intializeHeap(nums);
    }
    private void intializeHeap(int nums[]){
        for(int num : nums){
            if(heap.size()<k){
                heap.offer(num);
            }
            else{
                heap.offer(num);
                heap.poll();
            }
        }
    }
    
    public int add(int val) {
        if(heap.size()<k){
            heap.offer(val);
        }
        else{
            heap.offer(val);
            heap.poll();
        }
        return heap.peek();
    }
}
