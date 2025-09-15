class Solution {
    Node reverseList(Node head) {
        if(head==null || head.next==null)return head;
        Node newNode=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return newNode;
    }
}
