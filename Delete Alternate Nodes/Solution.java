/*
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}
*/
class Solution {
    public void deleteAlt(Node head) {
        if(head==null || head.next==null)return;
        Node curr=head;
        while(curr!=null && curr.next!=null){
            curr.next=curr.next.next;
            curr=curr.next;
        }
    }
}
