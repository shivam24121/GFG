class Solution {
    static class NodeInfo {
        boolean isBST;
        int size, min, max;
        
        NodeInfo(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }
    
    static int largestBst(Node root) {
        return helper(root).size;
    }
    
    private static NodeInfo helper(Node root) {
        if (root == null) {
            return new NodeInfo(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        
        NodeInfo left = helper(root.left);
        NodeInfo right = helper(root.right);
        
        if (left.isBST && right.isBST && root.data > left.max && root.data < right.min) {
            return new NodeInfo(
                true,
                left.size + right.size + 1,
                Math.min(root.data, left.min),
                Math.max(root.data, right.max)
            );
        }
        
        return new NodeInfo(false, Math.max(left.size, right.size), 0, 0);
    }
}
