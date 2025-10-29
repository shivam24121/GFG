/*Complete the function below
Node is as follows:
class Node{
    int data;
    Node left,right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public static int maxNodeLevel(Node root) {
        int level=0;
        int num=0;
        int res=0;
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int n=q.size();
            if(n>num){
                num=n;
                res=level;
            }
            for(int i=0;i<n;i++){
                Node curr=q.poll();
                if(curr.left!=null)q.offer(curr.left);
                if(curr.right!=null)q.offer(curr.right);
            }
            level++;
        }
        return res;
    }
}
