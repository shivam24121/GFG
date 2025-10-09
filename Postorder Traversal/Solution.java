class Solution {
    public ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer>res=new ArrayList<>();
        solve(res,root);
        return res;
    }
    public void solve(ArrayList<Integer>res,Node root){
        if(root==null)return;
        solve(res,root.left);
        solve(res,root.right);
        res.add(root.data);
    }
}
