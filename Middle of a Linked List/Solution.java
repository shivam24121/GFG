class Solution {
    int getMiddle(Node head) {
        if(head.next==null)return head.data;
        Node fast=head,slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow.data;
    }
}
