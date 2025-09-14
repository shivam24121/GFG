/*
class Node
{
    int data;
    Node next;

    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class Solution {
    public static int fractional_node(Node head, int k) {
        int n=0;
        Node curr=head;
        while(curr!=null){
            n++;
            curr=curr.next;
        }
        int root=(n+k-1)/k;
        Node temp=head;
        while(root-->1){
            temp=temp.next;
        }
        return temp.data;
    }
}
