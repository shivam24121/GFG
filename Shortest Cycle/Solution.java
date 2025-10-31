class Solution {
    public int shortCycle(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int[] e:edges){
            int u=e[0];
            int v=e[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        int res=Integer.MAX_VALUE;
        
        for(int i=0;i<V;i++){
            int[] dist=new int[V];
            Arrays.fill(dist,-1);
            dist[i]=0;
            Queue<Integer>q=new LinkedList<>();
            q.offer(i);
            
            while(!q.isEmpty()){
                int curr=q.poll();
                for(int neigh:adj.get(curr)){
                    if(dist[neigh]==-1){
                        dist[neigh]=dist[curr]+1;
                        q.add(neigh);
                    }
                    else if(dist[neigh]>=dist[curr]){
                        res=Math.min(res,dist[neigh]+dist[curr]+1);
                    }
                }
            }
        }
        return res==Integer.MAX_VALUE?-1:res;
    }
}
