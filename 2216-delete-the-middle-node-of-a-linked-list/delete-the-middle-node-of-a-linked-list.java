class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null; 
        }
        
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        
        // Move 'slow' to the middle node and 'prev' to the node before it
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // Delete the middle node by updating 'prev.next'
        prev.next = slow.next;
        
        return head; // Return the head of the modified list
    }
}
