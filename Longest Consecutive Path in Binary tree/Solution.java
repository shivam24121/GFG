class Solution {
    int ans=0;
    public int longestConsecutive(Node root) {
        
        solve(root);
        return ans>1?ans:-1;
    }
    public int solve(Node root){
        
        if(root==null)return 0;
        
        int left=solve(root.left);
        int right=solve(root.right);
        
        int curr=1;
        
        if(root.left!=null && root.data+1==root.left.data){
            curr=Math.max(curr,left+1);
        }
        
        if(root.right!=null && root.data+1==root.right.data){
            curr=Math.max(curr,right+1);
        }
        ans=Math.max(ans,curr);
        return curr;
    }
}
