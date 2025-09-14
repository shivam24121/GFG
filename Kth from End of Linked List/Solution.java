class Solution {
    int getKthFromLast(Node head, int k) {
        if(head==null)return 0;
        Node fast=head,slow=head;
        int n=0;
        for(int i=0;i<k && fast!=null;i++){
            fast=fast.next;
            n++;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
            n++;
        }
        if(n<k)return -1;
        return slow.data;
    }
}
