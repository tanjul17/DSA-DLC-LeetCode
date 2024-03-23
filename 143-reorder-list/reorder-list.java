class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        // Find the middle of the list
        ListNode middleNode = middle(head);
        
        // Reverse the second half of the list
        ListNode secondHalfReversed = reverse(middleNode.next);
        
        // Break the list into two halves
        middleNode.next = null;
        
        // Merge the two halves
        merge(head, secondHalfReversed);
    }
    
    // Helper method to find the middle node of the list
    private ListNode middle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    // Helper method to reverse a linked list
    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
    
    // Helper method to merge two linked lists
    private static void merge (ListNode l1,ListNode l2){
        while(l2 !=null){
            ListNode next = l1.next;
            l1.next =l2;
            l1=l2;
            l2=next;
        }
    }
}
