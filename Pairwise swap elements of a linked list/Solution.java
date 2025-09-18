class Solution {
    public Node pairwiseSwap(Node head) {
        if(head==null || head.next==null)return head;
        
        Node temp=null;
        temp=head.next;
        head.next=pairwiseSwap(head.next.next);
        temp.next=head;
        return temp;
    }
}
