class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        int V=adj.size();
        ArrayList<Integer>res=new ArrayList<>();
        boolean[] check=new boolean[V];
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        check[0]=true;
        
        while(!q.isEmpty()){
            int n=q.poll();
            res.add(n);
            
            for(int temp:adj.get(n)){
                if(!check[temp]){
                    check[temp]=true;
                    q.offer(temp);
                }
            }
        }
        return res;
    }
}
