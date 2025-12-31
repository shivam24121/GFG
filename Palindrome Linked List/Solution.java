
class Solution {
    public boolean isPalindrome(Node head) {
        Node curr=head;
        Node slow=head,fast=head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node h2=reverse(slow);
        Node h1=head;
        
        while(h1!=null && h2!=null){
            if(h1.data!=h2.data){
                return false;
            }
            h1=h1.next;
            h2=h2.next;
        }
        return true;
    }
    public Node reverse(Node head){
        Node curr=head;
        Node prev=null,next=null;
        
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
