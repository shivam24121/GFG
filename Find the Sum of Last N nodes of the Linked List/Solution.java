/*
Node class is as follows:

class Node {
    int data;
    Node next;

    public Node (int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {

    // Return the sum of last k nodes
    public int sumOfLastN_Nodes(Node head, int n) {
        Node curr=head;
        int ct=0;
        while(curr!=null){
            ct++;
            curr=curr.next;
        }
        int sum=0;
        Node temp=head;
        while(ct>n){
            temp=temp.next;
            ct--;
        }
        while(temp!=null){
            sum+=temp.data;
            temp=temp.next;
        }
        return sum;
    }
}
