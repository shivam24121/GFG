/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public int countAllPaths(Node root, int k) {
        int main=solve(root,k);
        int l=solve(root.left,k);
        int r=solve(root.right,k);
        return l+r+main;
    }
    public int solve(Node root,int k){
        if(root==null)return 0;
        int ct=0;
        if(root.data==k)ct++;
        ct+=solve(root.left,k-root.data);
        ct+=solve(root.right,k-root.data);
        return ct;
    }
}
