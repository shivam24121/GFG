
class Solution {
    ArrayList<Integer> zigZagTraversal(Node root) {
        ArrayList<Integer>res=new ArrayList<>();
        if(root==null)return res;
        
        Queue<Node>q=new LinkedList<>();
        q.offer(root);
        boolean fl=true;
        
        while(!q.isEmpty()){
            int n=q.size();
            ArrayList<Integer>temp=new ArrayList<>();
            for(int i=0;i<n;i++){
                Node curr=q.poll();
                temp.add(curr.data);
                if(curr.left!=null)q.offer(curr.left);
                if(curr.right!=null)q.offer(curr.right);
            }
            if(!fl){
                Collections.reverse(temp);
            }
            res.addAll(temp);
            fl=!fl;
        }
        return res;
    }
}
