class Solution {
    static int ct;
    static ArrayList<Integer> articulationPoints(int n, int[][] edges) {
        
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        
        ArrayList<Integer>res=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int[] e:edges){
            int u=e[0];
            int v=e[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        boolean[] vis=new boolean[n];
        int[] time=new int[n];
        int[] min=new int[n];
        boolean[] ap=new boolean[n];
        
        ct=1;
        
        for(int i=0;i<n;i++){
            if(vis[i]==false){
                dfs(i,-1,adj,vis,time,min,ap);
            }
        }
        for(int i=0;i<n;i++){
            if(ap[i]==true){
                res.add(i);
            }
        }
        if(res.size()==0)res.add(-1);
        return res;
    }
    public static void dfs(int u,int parent,ArrayList<ArrayList<Integer>>adj,
                           boolean[] vis,int[] time,int[] min,boolean[] ap){
        
        vis[u]=true;
        time[u]=ct;
        min[u]=ct;
        ct++;
        int child=0;
        
        for(int neigh:adj.get(u)){
            if(neigh==parent)continue;
            if(!vis[neigh]){
                dfs(neigh,u,adj,vis,time,min,ap);
                child++;
                if(min[neigh]>=time[u] && parent!=-1){
                    ap[u]=true;
                }
                min[u]=Math.min(min[u],min[neigh]);
            }
            else {
                min[u]=Math.min(min[u],time[neigh]);
            }
        }
        if(parent==-1 && child>1){
                ap[u]=true;
        }
    }
}
