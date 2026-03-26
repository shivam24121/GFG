class Solution {
    
    static class Pair{
        int n;
        int w;
        Pair(int n,int w){
            this.n=n;
            this.w=w;
        }
    }
    int mod=(int)1e9+7;
    
    public int countPaths(int n, int[][] edges) {
        ArrayList<ArrayList<Pair>>adj=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] e:edges){
            int u=e[0];
            int v=e[1];
            int w=e[2];
            adj.get(u).add(new Pair(v,w));
            adj.get(v).add(new Pair(u,w));
        }
        int[] dist=new int[n];
        int[] ways=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[0]=0;
        ways[0]=1;
        
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->a.w-b.w);
        pq.add(new Pair(0,0));
        
        while(!pq.isEmpty()){
            Pair curr=pq.poll();
            int currNode=curr.n;
            int currDist=curr.w;
            
            if(currDist>dist[currNode])continue;
            
            for(Pair neigh:adj.get(currNode)){
                int nextNode=neigh.n;
                int nextDist=neigh.w;
                
                int newDist=currDist+nextDist;
                
                if(newDist<dist[nextNode]){
                    dist[nextNode]=newDist;
                    pq.offer(new Pair(nextNode,dist[nextNode]));
                    ways[nextNode]=ways[currNode];
                }
                else if(newDist==dist[nextNode]){
                    ways[nextNode]=(ways[nextNode]+ways[currNode])%mod;
                }
            }
        }
        return ways[n-1];
    }
}
