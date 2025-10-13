
class Solution {
    public static int getSize(Node node) {
        ArrayList<Integer>res=new ArrayList<>();
        solve(res,node);
        return res.size();
    }
    public static void solve(ArrayList<Integer>res,Node root){
        if(root==null)return;
        res.add(root.data);
        solve(res,root.left);
        solve(res,root.right);
    }
}
