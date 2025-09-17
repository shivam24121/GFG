class Solution {
    public int lengthOfLoop(Node head) {
        if(head==null || head.next==null)return 0;
        Node fast=head,slow=head,temp=head;
        Node curr=head;
        
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                break;
            }
        }
        if(fast==slow){
            while(slow!=temp){
                slow=slow.next;
                temp=temp.next;
            }
            slow=slow.next;
            int ct=1;
            while(slow!=temp){
                slow=slow.next;
                ct++;
            }
            return ct;
        }
        return 0;
    }
}
