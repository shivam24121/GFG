class Solution {
    public void toSumTree(Node root) {
        
        solve(root);
    }
    public int solve(Node root){
        if(root==null)return 0;
        
        int l=solve(root.left);
        int r=solve(root.right);
        
        int val=root.data;
        
        if(l==0 && r==0){
            root.data=0;
            return val;
        }
        else{
            root.data=r+l;
            return val+r+l;
        }
    }
}
