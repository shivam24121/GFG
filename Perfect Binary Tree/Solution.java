class Solution {
    public boolean isPerfect(Node root) {
        if(root==null)return true;
        
        int expected=1;
        
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            if(n!=expected)return false;
            for(int i=0;i<n;i++){
                Node curr=q.remove();
                if(curr.left==null && curr.right!=null ||
                   curr.left!=null && curr.right==null)return false;
                if(curr.left!=null)q.add(curr.left);
                if(curr.right!=null)q.add(curr.right);
            }
            expected*=2;
        }
        return true;
    }
}
