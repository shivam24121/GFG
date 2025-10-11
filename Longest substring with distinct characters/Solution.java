class Solution {
    int max;
    int findMaxSum(Node root) {
        max=Integer.MIN_VALUE;
        dfs(root);
        return max;
    }
    int dfs(Node root){
        if(root==null)return 0;
        
        int left=Math.max(0,dfs(root.left));
        int right=Math.max(0,dfs(root.right));
        
        int curr=root.data+left+right;
        max=Math.max(max,curr);
        return root.data +Math.max(left,right);
    }
}
