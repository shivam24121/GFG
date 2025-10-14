class Solution {
    public ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer>list=new ArrayList<>();
        if(root==null)return list;
        
        Queue<Node>queue=new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            int n=queue.size();
            for(int i=0;i<n;i++){
                Node curr=queue.poll();
                if(i==0)list.add(curr.data);
                
                if(curr.left!=null)queue.add(curr.left);
                if(curr.right!=null)queue.add(curr.right);
            }
        }
        return list;
    }
}
