
class Solution {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        
        List<List<Integer>>res=new ArrayList<>();
        for(int j=0;j<V;j++){
            res.add(new ArrayList<Integer>());
        }
        
        for(int a[]:edges){
            int u=a[0];
            int v=a[1];
            
            res.get(u).add(v);
            res.get(v).add(u);
        }
        return res;
    }
    
}
