class Solution {
    static class Pair{
        int node;
        int distance;
        Pair(int n,int d){
            this.node=n;
            this.distance=d;
        }
    }
    public int spanningTree(int n, int[][] edges) {
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
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->a.distance-b.distance);
        pq.add(new Pair(0,0));
        
        int sum=0;
        boolean[] visited=new boolean[n];
        
        while(!pq.isEmpty()){
            Pair curr=pq.poll();
            int currNode=curr.node;
            int currDist=curr.distance;
            
            if(visited[currNode])continue;
            visited[currNode]=true;
            
            sum+=currDist;
            
            for(Pair neigh:adj.get(currNode)){
                int nextNode=neigh.node;
                int nextDist=neigh.distance;
                
                if(!visited[nextNode]){
                    pq.offer(new Pair(nextNode,nextDist));
                }
            }
        }
        return sum;
    }
}
