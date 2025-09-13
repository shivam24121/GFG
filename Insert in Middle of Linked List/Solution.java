/*
Structure of node class is:
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    public Node insertInMiddle(Node head, int x) {
        Node dummy=new Node(-1);
        dummy.next=head;
        Node temp=new Node(x);
        
        if(head==null)return temp;
        
        Node slow=dummy,fast=dummy;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        temp.next=slow.next;
        slow.next=temp;
        return dummy.next;
    }
}
