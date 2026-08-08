class Solution {
    
    int[] parent;
    int[] size;
    
    public void dsu(int n){
        
        parent=new int[n];
        size=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
            size[i]=1;
        }
    }
    public int find(int u){
        if(u!=parent[u]){
            parent[u]=find(parent[u]);
        }
        return parent[u];
    }
    public int union(int u,int v){
        
        u=find(u);
        v=find(v);
        
        if(u==v)return 1;
        
        if(size[u]>size[v]){
            size[u]+=size[v];
            parent[v]=u;
        }
        else{
            size[v]+=size[u];
            parent[u]=v;
        }
        return 0;
    }
    int minEdgesReq(int n, int[][] edges) {
        
        dsu(n);
        
        int extra=0;
        
        for(int[] e:edges){
            
            int u=e[0];
            int v=e[1];
            
            extra+=union(u,v);
        }
        int component=0;
        
        for(int i=0;i<n;i++){
            if(i==parent[i]){
                component++;
            }
        }
        component--;
        return component>extra?-1:component;
    }
}
