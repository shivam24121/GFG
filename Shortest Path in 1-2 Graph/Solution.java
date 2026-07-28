class Solution {
    public int shortestPath(int n, int src, int dest, int[][] edges) {
        
        ArrayList<ArrayList<int[]>>adj=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] e:edges){
            
            int u=e[0];
            int v=e[1];
            int w=e[2];
            
            adj.get(u).add(new int[]{v,w});
            adj.get(v).add(new int[]{u,w});
        }
        int[] dist=new int[n];
        int inf=(int)1e7;
        Arrays.fill(dist,inf);
        dist[src]=0;
        
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->Integer.compare(a[1],b[1]));
        pq.offer(new int[]{src,0});
        
        while(!pq.isEmpty()){
            
            int[] curr=pq.poll();
            int currNode=curr[0];
            int currDist=curr[1];
            
            if(dist[currNode]<currDist){
                continue;
            }
            for(int[] neigh:adj.get(currNode)){
                
                int nextNode=neigh[0];
                int nextDist=neigh[1];
                
                if(dist[nextNode]>dist[currNode]+nextDist){
                    dist[nextNode]=dist[currNode]+nextDist;
                    pq.offer(new int[]{nextNode,dist[nextNode]});
                }
            }
        }
        return dist[dest]==inf?-1:dist[dest];
    }
}
