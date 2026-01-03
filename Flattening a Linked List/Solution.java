/*
class Node {
    int data;
    Node next;
    Node bottom;

    Node(int x) {
        data = x;
        next = null;
        bottom = null;
    }
}
*/
class Solution {
    public Node flatten(Node root) {
        if(root==null)return null;
        Node head=root;
        Node head2=flatten(root.next);
        return merge(head,head2);
    }
    public Node merge(Node h1,Node h2){
        if(h1==null)return h2;
        if(h2==null)return h1;
        Node temp;
        if(h1.data<h2.data){
            temp=h1;
            temp.bottom=merge(h1.bottom,h2);
        }
        else{
            temp=h2;
            temp.bottom=merge(h1,h2.bottom);
        }
        return temp;
    }
}
