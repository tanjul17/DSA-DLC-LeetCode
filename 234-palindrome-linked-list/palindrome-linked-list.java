class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode cur = middle(head);
        ListNode prev = null;
        
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        
        ListNode reversed = prev;
        ListNode original = head;
        
        while (reversed != null) {
            if (original.val != reversed.val) {
                return false;
            }
            original = original.next;
            reversed = reversed.next;
        }
        
        return true;
    }
    
    public ListNode middle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
}