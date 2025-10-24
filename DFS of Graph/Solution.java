class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        int n=adj.size();
        ArrayList<Integer> res=new ArrayList<>();
        boolean[] check=new boolean[n];
        solve(adj,check,0,res);
        
        return res;
    }
    public void solve(ArrayList<ArrayList<Integer>>adj,boolean[] check
                      ,int st,ArrayList<Integer>res){
        
        res.add(st);
        check[st]=true;
        
        for(int i=0;i<adj.get(st).size();i++){
            int next=adj.get(st).get(i);
            if(!check[next]){
                solve(adj,check,next,res);
            }
        }
    }
}

// 2 3 1 0 4
// 0 2 4 3 1
