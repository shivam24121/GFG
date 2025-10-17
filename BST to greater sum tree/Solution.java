class Solution {
    public static void transformTree(Node root) {
        ArrayList<Integer> res=new ArrayList<>();
        solve(res,root);
        ArrayList<Integer>suffix=new ArrayList<>();
        int sum=0;
        for(int i=0;i<res.size();i++){
            suffix.add(0);
        }
        for(int i=res.size()-1;i>=0;i--){
            suffix.set(i,sum);
            sum+=res.get(i);
        }
        int[] idx={0};
        helper(root,suffix,idx);
    }
    public static void helper(Node root,ArrayList<Integer>suffix,int[] idx){
        if(root==null )return;
        helper(root.left,suffix,idx);
        root.data=suffix.get(idx[0]++);
        helper(root.right,suffix,idx);
    }
    public static void solve(ArrayList<Integer>res, Node root){
        if(root==null)return;
        solve(res,root.left);
        res.add(root.data);
        solve(res,root.right);
    }
}
