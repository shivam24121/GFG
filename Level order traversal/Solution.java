class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        ArrayList<ArrayList<Integer>>res=new ArrayList<>();
        if(root==null)return res;
        Queue<Node>queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            ArrayList<Integer>l=new ArrayList<>();
            for(int i=0;i<size;i++){
                Node temp=queue.poll();
                l.add(temp.data);
                if(temp.left!=null)queue.add(temp.left);
                if(temp.right!=null)queue.add(temp.right);
            }
            res.add(l);
        }
        return res;
    }
}
