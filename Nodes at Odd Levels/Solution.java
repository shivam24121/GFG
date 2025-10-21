class Solution {
    public ArrayList<Integer> nodesAtOddLevels(Node root) {
        ArrayList<Integer>res=new ArrayList<>();
        if(root==null)return res;
        
        Queue<Node>q=new LinkedList<>();
        q.offer(root);
        boolean fl=true;
        
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0;i<n;i++){
                Node curr=q.poll();
                if(fl){
                    res.add(curr.data);
                }
                if(curr.left!=null)q.offer(curr.left);
                if(curr.right!=null)q.offer(curr.right);
            }
            fl=!fl;
        }
        return res;
    }
}
