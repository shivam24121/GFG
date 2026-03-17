
class Solution {
    int time=0;
    public int minTime(Node root, int target) {
        solve(root,target);
        return time;
    }
    public int solve(Node root,int x){
        if(root==null)return 0;
        int l=solve(root.left,x);
        int r=solve(root.right,x);
        
        if(root.data==x){
            time=Math.max(l,r);
            return -1;
        }
        if(l>=0 && r>=0){
            return Math.max(l,r)+1;
        }
        else{
            time=Math.max(Math.abs(l)+Math.abs(r),time);
            return Math.min(r,l)-1;
        }
    }
}
