class Solution {
    int res=-1;
    public int longestCycle(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] e:edges){
            int u=e[0];
            int v=e[1];
            adj.get(u).add(v);
        }
        boolean[] vis=new boolean[n];
        boolean[] inrec=new boolean[n];
        int[] dist=new int[n];
        Arrays.fill(dist,1);
        for(int i=0;i<n;i++){
            if(!vis[i]){
                dfs(i,dist,vis,inrec,adj);
            }
        }
        return res;
    }
    public void dfs(int u,int[] dist,boolean[] vis,boolean[] inrec,ArrayList<ArrayList<Integer>>adj){
        vis[u]=true;
        inrec[u]=true;
        
        for(int neigh:adj.get(u)){
            if(!vis[neigh]){
                dist[neigh]=dist[u]+1;
                dfs(neigh,dist,vis,inrec,adj);
            }
            else if(inrec[neigh]==true){
                res=Math.max(res,dist[u]-dist[neigh]+1);
            }
        }
        inrec[u]=false;
    }
}
