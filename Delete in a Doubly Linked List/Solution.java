/*
Structure of a Doubly LinkList
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node delPos(Node head, int x) {
        if(x==1){
           head=head.next;
           if(head!=null){
               head.prev=null;
           }
           return head;
        }
        Node curr=head;
        for(int i=1;i<x;i++){
            curr=curr.next;
        }
        if(curr==null)return head;
        
        if(curr.prev!=null){
            curr.prev.next=curr.next;
        }
        if(curr.next!=null){
            curr.next.prev=curr.prev;
        }
        return head;
    }
}
