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
    static class Pair{
        Node node;
        int pos;
        Pair(Node node,int pos){
            this.node=node;
            this.pos=pos;
        }
    }
    public ArrayList<ArrayList<Integer>> verticalOrder(Node root) {
        TreeMap<Integer,ArrayList<Integer>>map=new TreeMap<>();
        Queue<Pair>q=new ArrayDeque<>();
        q.offer(new Pair(root,0));
        while(!q.isEmpty()){
            Pair curr=q.poll();
            int currPos=curr.pos;
            Node currNode=curr.node;
            map.putIfAbsent(currPos,new ArrayList<>());
            map.get(currPos).add(currNode.data);
            if(currNode.left!=null){
                q.offer(new Pair(currNode.left,currPos-1));
            }
            if(currNode.right!=null){
                q.offer(new Pair(currNode.right,currPos+1));
            }
        }
        ArrayList<ArrayList<Integer>>res=new ArrayList<>(map.values());
        return res;
    }
}
