class Solution {
    public ArrayList<Integer> preorder(Node root) {
        ArrayList<Integer> res=new ArrayList<>();
        if(root==null)return res;
        Stack<Node> st=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            Node curr=st.pop();
            res.add(curr.data);
            if(curr.right!=null)st.push(curr.right);
            if(curr.left!=null)st.push(curr.left);
        }
        return res;
    }
}
