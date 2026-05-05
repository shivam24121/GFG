
class Solution {
    int ct=0;
    public int getSize(Node root) {
        solve(root);
        return ct;
    }
    public void solve(Node root){
        if(root==null){
            return;
        }
        ct++;
        solve(root.left);
        solve(root.right);
    }
}
