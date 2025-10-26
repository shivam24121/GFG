class Solution {
    
    int[] parent;
    int[] size;
    
    public void Solution(int n){
        parent=new int[n];
        size=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
            size[i]=1;
        }
    }
    public int find(int u){
        if(parent[u]!=u){
            parent[u]=find(parent[u]);
        }
        return parent[u];
    }
    public void union(int u,int v){
        int uu=find(u);
        int vv=find(v);
        
        if(uu==vv)return;
        
        if(size[uu]<size[vv]){
            parent[uu]=vv;
            size[vv]+=size[uu];
        }
        else{
            parent[vv]=uu;
            size[uu]+=size[vv];
        }
    }
    public boolean isCycle(int V, int[][] edges) {
        Solution(V);
        int e=edges.length;
        
        for(int i=0;i<e;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            
            if(find(u)==find(v)){
                return true;
            }
            union(u,v);
        }
        return false;
    }
}
