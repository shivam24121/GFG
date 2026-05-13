class Solution {
    public int findMotherVertex(int n, int[][] edges) {
        
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] e:edges){
            
            int u=e[0];
            int v=e[1];
            adj.get(u).add(v);
        }
        Stack<Integer>st=new Stack<>();
        boolean[] vis=new boolean[n];
        
        for(int i=0;i<n;i++){
            
            if(!vis[i]){
                dfs1(i,adj,vis,st);
            }
        }
        Arrays.fill(vis,false);
        
        int[] ct=new int[1];
        
        dfs2(st.peek(),ct,adj,vis);
        
        return ct[0]==n?st.peek():-1;
    }
    public void dfs1(int u,ArrayList<ArrayList<Integer>>adj,
                     boolean[] vis,Stack<Integer>st){
        
        vis[u]=true;
        
        for(int neigh:adj.get(u)){
            if(!vis[neigh]){
                dfs1(neigh,adj,vis,st);
            }
        }
        st.push(u);
    }
    public void dfs2(int u,int[] ct,ArrayList<ArrayList<Integer>>adj,
                     boolean[] vis){
        
        ct[0]++;
        vis[u]=true;
        
        for(int neigh:adj.get(u)){
            if(!vis[neigh]){
                dfs2(neigh,ct,adj,vis);
            }
        }
    }
}
