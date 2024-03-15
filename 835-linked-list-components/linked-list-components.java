class Solution {
    public int numComponents(ListNode head, int[] nums) {
        if (head == null) return 0;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        ListNode curr = head;
        int cnt = 0;
        boolean isConnected = false;
        while (curr != null) {
            if (set.contains(curr.val)) {
                if (!isConnected) {
                    cnt++; 
                    isConnected = true;
                }
            } else {
                isConnected = false; 
            }
            curr = curr.next;
        }
        return cnt;
    }
}
