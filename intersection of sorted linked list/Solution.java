class Solution {
    public static Node findIntersection(Node head1, Node head2) {
        if(head1==null || head2==null)return head1;
        Node cur1=head1,cur2=head2;
        Node dummy=new Node(-1);
        Node res=dummy;
        
        while(cur1!=null && cur2!=null){
            if(cur1.data==cur2.data){
                res.next=new Node(cur1.data);
                res=res.next;
                cur1=cur1.next;
                cur2=cur2.next;
            }
            else if(cur1.data<cur2.data){
                cur1=cur1.next;
            }
            else{
                cur2=cur2.next;
            }
        }
        return dummy.next;
    }
}
