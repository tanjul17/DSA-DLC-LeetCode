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
    ArrayList<Integer>arr = new ArrayList<>();

    public Solution(ListNode head) {
        while(head!=null){
            arr.add(head.val);
            head = head.next;
        }    
    }
    
     public int getRandom() {
        double rand=Math.random()*arr.size();
        return arr.get((int)rand);
    }
}
