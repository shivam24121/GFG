/*
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public ArrayList<Integer> printList(Node head) {
        // code here
        ArrayList<Integer>l=new ArrayList<>();
        Node temp=head;
        while(temp!=null){
            l.add(temp.data);
            temp=temp.next;
        }
        return l;
    }
}
