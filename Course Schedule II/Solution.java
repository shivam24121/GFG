class Solution {
    public ArrayList<Integer> findOrder(int n, int[][] prerequisites) {
        ArrayList<Integer> res=new ArrayList<>();
        
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int[] inorder=new int[n];
        
        for(int[] e:prerequisites){
            int u=e[0];
            int v=e[1];
            adj.get(v).add(u);
            inorder[u]++;
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(inorder[i]==0){
                q.offer(i);
                res.add(i);
            }
        }
        while(!q.isEmpty()){
            int curr=q.poll();
            for(int neigh:adj.get(curr)){
                inorder[neigh]--;
                
                if(inorder[neigh]==0){
                    q.offer(neigh);
                    res.add(neigh);
                }
            }
        }
        return res;
    }
}
