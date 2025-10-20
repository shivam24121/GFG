class Solution {
    public ArrayList<Integer> largestValues(Node root) {
        ArrayList<Integer>res=new ArrayList<>();
        if(root==null)return res;
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            int max=0;
            for(int i=0;i<n;i++){
                Node curr=q.remove();
                if(curr.data>max){
                    max=curr.data;
                }
                if(curr.left!=null)q.add(curr.left);
                if(curr.right!=null)q.add(curr.right);
            }
            res.add(max);
        }
        return res;
    }
}
