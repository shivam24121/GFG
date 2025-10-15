class Solution {
    int res=-1,ct=0;
    public int kthSmallest(Node root, int k) {
        solve(root,k);
        return res;
    }
    public void solve(Node root,int k){
        if(root==null || res!=-1)return;
        solve(root.left,k);
        ct++;
        if(ct==k){
            res=root.data;
            return;
        }
        solve(root.right,k);
    }
}
