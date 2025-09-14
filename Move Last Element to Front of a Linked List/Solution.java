class Solution {
    public static Node moveToFront(Node head) {
        if(head==null || head.next==null)return head;
        Node curr=head;
        while(curr.next.next!=null){
            curr=curr.next;
        }
        Node temp=curr.next;
        curr.next=null;
        temp.next=head;
        head=temp;
        return head;
    }
}
