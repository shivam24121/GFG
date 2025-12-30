/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public Node addTwoLists(Node head1, Node head2) {
        Node dummy=new Node(-1);
        Node temp=dummy;
        Node t1=reverse(head1);
        Node t2=reverse(head2);
        
        int carry=0;
        while(t1!=null || t2!=null){
            int sum=carry;
            if(t1!=null)sum+=t1.data;
            if(t2!=null)sum+=t2.data;
            temp.next=new Node(sum%10);
            temp=temp.next;
            carry=sum/10;
            
            if(t1!=null)t1=t1.next;
            if(t2!=null)t2=t2.next;
        }
        if(carry!=0){
            temp.next=new Node(carry);
        }
        Node res=reverse(dummy.next);
        while(res!=null && res.data==0){
            res=res.next;
        }
        return res==null?new Node(0):res;
    }
    public Node reverse(Node head){
        Node curr=head;
        Node next=null,prev=null;
        
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
