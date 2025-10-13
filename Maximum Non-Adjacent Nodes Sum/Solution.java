
class Solution {
    Map<Node,Integer>map=new HashMap<>();
    public int getMaxSum(Node root) {

        if(root==null)return 0;
        if(map.containsKey(root))return map.get(root);
        
        int pick=root.data;
        
        if(root.left!=null){
            pick+=getMaxSum(root.left.left)+getMaxSum(root.left.right);
        }
        if(root.right!=null){
            pick+=getMaxSum(root.right.left)+getMaxSum(root.right.right);
        }
        
        int skip=getMaxSum(root.left)+getMaxSum(root.right);
        
        int res=Math.max(pick,skip);
        map.put(root,res);
        return res;
    }
}
