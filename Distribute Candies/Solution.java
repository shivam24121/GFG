class Solution {
    int ct=0;
    public int distCandy(Node root) {
        solve(root);
        return ct;
    }
    public int solve(Node root){
        if(root==null)return 0;
        
        int l=solve(root.left);
        int r=solve(root.right);
        ct+=Math.abs(l)+Math.abs(r);
        return root.data+l+r-1;
    }
}
