class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode newDummy = new ListNode(0);
        ListNode curr = newDummy;
        ListNode temp = head.next; 

        while (temp != null) {
            int sum = 0;

            // Sum the values between zeros
            while (temp != null && temp.val != 0) {
                sum += temp.val;
                temp = temp.next;
            }

            // Create a new node with the summed value and attach it to the result list
            curr.next = new ListNode(sum);
            curr = curr.next;

            // Move to the next node after zero
            if (temp != null) {
                temp = temp.next;
            }
        }

        return newDummy.next;
    }
}
