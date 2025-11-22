class Solution {
    
    int[] parent;
    int[] size;
    
    public Solution(){}
    
    public void Solution(int n){
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
    public int minConnect(int V, int[][] edges) {
        Solution(V);
        int component=0,extra=0;
        
        for(int[] e:edges){
            int u=e[0];
            int v=e[1];
            
            int uu=find(u);
            int vv=find(v);
            
            if(uu==vv)extra++;
            else union(u,v);
        }
        for(int i=0;i<V;i++){
            if(i==parent[i]){
                component++;
            }
        }
        return component>extra+1?-1:component-1;
    }
}
