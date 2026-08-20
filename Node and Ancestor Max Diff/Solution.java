class Solution {
    
    int res=Integer.MIN_VALUE;
    
    int maxDiff(Node root) {
        solve(root);
        return res;
    }
    int solve(Node root){
        if(root==null){
            return Integer.MAX_VALUE;
        }
        int l=solve(root.left);
        int r=solve(root.right);
        
        res=Math.max(res,root.data-Math.min(l,r));
        
        return Math.min(root.data,Math.min(l,r));
    }
}
