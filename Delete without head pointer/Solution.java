class Solution {
    public void deleteNode(Node del_node) {
        if(del_node==null || del_node.next==null)return;
        
        del_node.data=del_node.next.data;
        del_node.next=del_node.next.next;
    }
}
