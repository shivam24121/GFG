class Solution {

    public int find(int u,int[] par){
        if(par[u]!=u){
            par[u]=find(par[u],par);
        }
        return par[u];
    }
    
    public void union_(int a, int b, int par[], int rank[]) {
        int aa=find(a,par);
        int bb=find(b,par);
        
        if(aa==bb)return;
        
        if(rank[aa]<rank[bb]){
            par[aa]=bb;
            rank[bb]+=rank[aa];
        }
        else{
            par[bb]=aa;
            rank[aa]+=rank[bb];
        }
    }

    // Function to check whether 2 nodes are connected or not.
    public Boolean isConnected(int a, int b, int par[], int rank[]) {
        return find(a,par)==find(b,par);
        
    }
}
