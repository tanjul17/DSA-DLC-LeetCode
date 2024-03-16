class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        
        if (l1.val > l2.val) {
            ListNode tm = l1;
            l1 = l2;
            l2 = tm;
        }
        
        ListNode res = l1;
        while (l1 != null && l2 != null) {
            ListNode tm = null;
            while (l1 != null && l1.val <= l2.val) {
                tm = l1;
                l1 = l1.next;
            }
            tm.next = l2;
            //swap
            ListNode tmp = l1;
            l1 = l2;
            l2 = tmp;
        }
        return res;
    }
}
