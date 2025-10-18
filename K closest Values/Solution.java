
class Solution {
    public ArrayList<Integer> getKClosest(Node root, int target, int k) {
        ArrayList<Integer>res=new ArrayList<>();
        solve(res,root);
        int n=res.size();
        
        int idx=Collections.binarySearch(res,target);
        if(idx<0){
            idx=-idx-1;
        }
        int l=idx-1;
        int r=idx;
        ArrayList<Integer>ans=new ArrayList<>();
        while(k-->0){
            if(l<0){
                ans.add(res.get(r++));
            }
            else if(r>=n){
                ans.add(res.get(l--));
            }
            else{
                int diffL=Math.abs(target-res.get(l));
                int diffR=Math.abs(target-res.get(r));
                
                if(diffL<=diffR){
                    ans.add(res.get(l--));
                }
                else{
                    ans.add(res.get(r++));
                }
            }
        }
        return ans;
    }
    public void solve(ArrayList<Integer>res,Node root){
        if(root==null)return;
        solve(res,root.left);
        res.add(root.data);
        solve(res,root.right);
    }
}
