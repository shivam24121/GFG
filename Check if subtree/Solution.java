class Solution {
    public boolean isSubTree(Node root1, Node root2) {
        if(root1==null){
            return false;
        }
        if(root1.data==root2.data){
            if(solve(root1,root2)){
                return true;
            }
        }
        boolean l=isSubTree(root1.left,root2);
        boolean r=isSubTree(root1.right,root2);
        
        return l||r;
    }
    public boolean solve(Node one,Node two){
        if(one==null && two==null){
            return true;
        }
        if(one==null || two==null){
            return false;
        }
        if(one.data!=two.data){
            return false;
        }
        boolean l=solve(one.left,two.left);
        boolean r=solve(one.right,two.right);
        
        return l && r;
    }
}
