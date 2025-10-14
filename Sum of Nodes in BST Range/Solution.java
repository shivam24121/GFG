class Solution {
    public int nodeSum(Node root, int l, int r) {
        ArrayList<Integer> list=new ArrayList<>();
        solve(list,root);
        int sum=list.stream()
                    .filter(x->x>=l && x<=r)
                    .reduce(0,(x,y)->x+y);
        return sum;
    }
    public void solve(ArrayList<Integer>res,Node root){
        if(root==null)return;
        res.add(root.data);
        solve(res,root.left);
        solve(res,root.right);
    }
}
