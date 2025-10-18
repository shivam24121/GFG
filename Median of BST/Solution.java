class Solution {
    public int findMedian(Node root) {
        ArrayList<Integer>res=new ArrayList<>();
        solve(res,root);
        int n=res.size();
        
        if(n%2==1){
            return res.get(n/2);
        }
        else{
            return res.get(n/2-1);
        }
    }
    public void solve(ArrayList<Integer>res,Node root){
        if(root==null)return;
        Stack<Node>st=new Stack<>();
        Node curr=root;
        while(curr!=null || !st.isEmpty()){
            while(curr!=null){
                st.push(curr);
                curr=curr.left;
            }
            curr=st.pop();
            res.add(curr.data);
            curr=curr.right;
        }
    }
}
