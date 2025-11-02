class Solution {
    public ArrayList<Integer> safeNodes(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        int[] inorder=new int[V];
        ArrayList<Integer>res=new ArrayList<>();
        
        for(int[] e:edges){
            int u=e[0];
            int v=e[1];
            adj.get(v).add(u);
            inorder[u]++;
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(inorder[i]==0){
                q.offer(i);
            }
        }
        
        while(!q.isEmpty()){
            int curr=q.poll();
            for(int neigh:adj.get(curr)){
                inorder[neigh]--;
                
                if(inorder[neigh]==0){
                    q.offer(neigh);
                }
            }
        }
        for(int i=0;i<V;i++){
            if(inorder[i]==0){
                res.add(i);
            }
        }
        return res;
    }
}
