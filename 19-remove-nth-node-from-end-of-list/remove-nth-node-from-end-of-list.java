/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // if(head.next==null){
        //     return null;
        // }
        // ListNode cur = head;
        // int len = 0;
        // while(cur!=null){
        //     cur = cur.next;
        //     len++;
        // }
        // if(n==len) return head.next;

        // int lastIndex = len-n;
        // ListNode prev = head;
        // int  i = 1;
        // while(i<lastIndex){
        //     prev = prev.next;
        //     i++;
        // }
        // prev.next = prev.next.next;
        // return head;
        ListNode start = new ListNode();
        start.next = head;
        ListNode slow = start;
        ListNode fast = start;

        for(int i=1;i<=n;++i){
            fast=fast.next;
        }
        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return start.next;
    }
}