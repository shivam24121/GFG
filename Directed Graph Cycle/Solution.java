class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        
        int[] inorder=new int[V];
        for(int[] e:edges){
            int u=e[0];
            int v=e[1];
            adj.get(u).add(v);
            inorder[v]++;
        }
        int ct=0;
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(inorder[i]==0){
                q.offer(i);
                ct++;
            }
        }
        while(!q.isEmpty()){
            int curr=q.poll();
            for(int neigh:adj.get(curr)){
                inorder[neigh]--;
                
                if(inorder[neigh]==0){
                    ct++;
                    q.offer(neigh);
                }
            }
        }
        return ct!=V;
    }
}
