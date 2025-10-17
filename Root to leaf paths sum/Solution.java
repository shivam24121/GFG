class Solution {
    public static int treePathsSum(Node root) {
        return dfs(root,0);
    }
    public static int dfs(Node root,int sum){
        if(root==null)return 0;
        
        sum=sum*10+root.data;
        
        if(root.left==null && root.right==null){
            return sum;
        }
        return dfs(root.left,sum) + dfs(root.right,sum);
    }
}
