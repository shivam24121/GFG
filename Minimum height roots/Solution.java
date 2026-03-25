class Solution {
    public ArrayList<Integer> minHeightRoot(int n, int[][] edges) {
        ArrayList<Integer>res=new ArrayList<>();
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int[] inorder=new int[n];
        for(int[] e:edges){
            int u=e[0];
            int v=e[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
            inorder[u]++;
            inorder[v]++;
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(inorder[i]==1){
                q.offer(i);
            }
        }
        while(n>2){
            int size=q.size();
            n-=size;
            for(int i=0;i<size;i++){
                int curr=q.poll();
                for(int neigh:adj.get(curr)){
                    inorder[neigh]--;
                    if(inorder[neigh]==1){
                        q.offer(neigh);
                    }
                }
            }
        }
        while(!q.isEmpty()){
            res.add(q.poll());
        }
        return res;
    }
}
