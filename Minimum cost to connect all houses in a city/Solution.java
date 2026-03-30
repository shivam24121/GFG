class Solution {

    int[] parent;
    int[] size;
    
    public void DSU(int n){
        parent=new int[n+1];
        size=new int[n+1];
        for(int i=0;i<=n;i++){
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
        u=find(u);
        v=find(v);
        
        if(u==v)return;
        
        if(size[u]>=size[v]){
            parent[v]=u;
            size[u]+=size[v];
        }
        else{
            size[v]+=size[u];
            parent[u]=v;
        }
    }
    public int minCost(int[][] houses) {
        int n=houses.length;
        DSU(n);
        ArrayList<int[]>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int dist=Math.abs(houses[i][0]-houses[j][0])+
                         Math.abs(houses[i][1]-houses[j][1]);
                
                list.add(new int[]{i,j,dist});
            }
        }
        Collections.sort(list,(a,b)->{
            return a[2]-b[2];
        });
        int res=0;
        int ct=0;
        
        int i=0;
        while(ct!=n-1){
            int[] curr=list.get(i);
            int x=curr[0];
            int y=curr[1];
            int w=curr[2];
            
            if(find(x)==find(y)){
                i++;
                continue;
            }
            
            ct++;
            union(x,y);
            res+=w;
            i++;
        }
        return res;
    }
}
