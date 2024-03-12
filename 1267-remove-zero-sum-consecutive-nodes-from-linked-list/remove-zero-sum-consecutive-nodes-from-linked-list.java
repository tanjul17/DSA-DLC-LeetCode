class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        Map<Integer,ListNode> hm=new HashMap<>();
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        hm.put(0,dummy);
        int preSum=0;
        while(head!=null){
            preSum+=head.val;
            if(!hm.containsKey(preSum)){
                hm.put(preSum,head);
            }
            else{
                ListNode start=hm.get(preSum);
                ListNode curr=start;
                int Sum=preSum;
                while(curr!=head){
                    curr=curr.next;
                    Sum+=curr.val;
                    if(curr!=head){
                        hm.remove(Sum);
                    }

                }
                start.next=head.next;
            }
            head=head.next;
        }
        return dummy.next;
    }
}