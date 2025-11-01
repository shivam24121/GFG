class Solution {
    public int[] bellmanFord(int V, int[][] edges, int src) {
        int[] dist=new int[V];
        Arrays.fill(dist,(int)1e9);
        dist[src]=0;
        
        for(int count=1;count<=V-1;count++){
            for(int[] e:edges){
                int u=e[0];
                int v=e[1];
                int w=e[2];
                
                if(dist[u]!=1e9 && dist[u]+w<dist[v]){
                    dist[v]=dist[u]+w;
                }
            }
        }
        for(int[] e:edges){
            int u=e[0];
            int v=e[1];
            int w=e[2];
            
            if(dist[u]!=1e9 && dist[u]+w<dist[v]){
                return new int[]{-1};
            }
        }
        return dist;
    }
}
