class Solution {
    public Node removeDuplicates(Node head) {
        Set<Integer> set=new HashSet<>();
        if(head==null|| head.next==null)return head;
        Node curr=head;
        Node prev=null;
        while(curr!=null && curr.next!=null){
            if(set.contains(curr.data)){
                prev.next=curr.next;
            }
            else{
                set.add(curr.data);
                prev=curr;
            }
            curr=curr.next;
        }
        return head;
    }
}
