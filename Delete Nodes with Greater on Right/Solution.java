class Solution {
    Node compute(Node head) {
        
        Node hed=reverse(head);
        Node curr=hed;
        
        int max=curr.data;
        
        while(curr!=null && curr.next!=null){
            if(curr.next.data<max){
                curr.next=curr.next.next;
            }
            else{
                curr=curr.next;
                max=curr.data;
            }
        }
        return reverse(hed);
        
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
