class Tree {
    ArrayList<Integer> noSibling(Node node) {
        ArrayList<Integer>res=new ArrayList<>();
        solve(res,node);
        if(res.size()==0){
            res.add(-1);
            return res;
        }
        Collections.sort(res);
        return res;
        
    }
    public void solve(ArrayList<Integer>res,Node root){
        if(root==null)return;
        
        if(root.left!=null && root.right==null){
            res.add(root.left.data);
        }
        if(root.left==null && root.right!=null){
            res.add(root.right.data);
        }
        solve(res,root.left);
        solve(res,root.right);
    }
}
