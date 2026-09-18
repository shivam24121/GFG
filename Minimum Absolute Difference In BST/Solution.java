class Solution {
    public int absDiff(Node root) {
        
        ArrayList<Integer>list=new ArrayList<>();
        solve(list,root);
        
        int diff=Integer.MAX_VALUE;
        
        for(int i=1;i<list.size();i++){
            diff=Math.min(diff,list.get(i)-list.get(i-1));
        }
        return diff;
    }
    public void solve(ArrayList<Integer>list,Node root){
        
        if(root==null){
            return;
        }
        solve(list,root.left);
        list.add(root.data);
        solve(list,root.right);
    }
}
