class Solution {
    public ArrayList<Integer> rightView(Node root) {
        ArrayList<Integer>res=new ArrayList<>();
        if(root==null)return res;
        
        Queue<Node>queue=new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            int n=queue.size();
            for(int i=0;i<n;i++){
                Node curr=queue.remove();
                if(i==n-1){
                    res.add(curr.data);
                }
                if(curr.left!=null)queue.add(curr.left);
                if(curr.right!=null)queue.add(curr.right);
            }
        }
        return res;
    }
}
