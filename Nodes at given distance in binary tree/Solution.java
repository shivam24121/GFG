class Solution {
    static Map<Integer,ArrayList<Integer>>adj;
    
    public static ArrayList<Integer> KDistanceNodes(Node root, int target, int k) {
        ArrayList<Integer>res=new ArrayList<>();
        
        adj=new HashMap<>();
        build(root);
        
        solve(target,k,res);
        Collections.sort(res);
        return res;
    }
    public static void solve(int u,int k,ArrayList<Integer>res){
        Queue<Integer>q=new LinkedList<>();
        HashSet<Integer>set=new HashSet<>();
        q.offer(u);
        set.add(u);
        
        while(!q.isEmpty() && k>0){
            int n=q.size();
            
            for(int i=0;i<n;i++){
                int curr=q.poll();
                for(int neigh:adj.get(curr)){
                    if(!set.contains(neigh)){
                        q.offer(neigh);
                        set.add(neigh);
                    }
                }
            }
            k--;
        }
        while(!q.isEmpty()){
            res.add(q.poll());
        }
    }
    
    public static void build(Node root){
        if(root==null)return;
        
        adj.putIfAbsent(root.data,new ArrayList<>());
        
        if(root.left!=null){
            adj.putIfAbsent(root.left.data,new ArrayList<>());
            adj.get(root.data).add(root.left.data);
            adj.get(root.left.data).add(root.data);
            build(root.left);
        }
        if(root.right!=null){
            adj.putIfAbsent(root.right.data,new ArrayList<>());
            adj.get(root.data).add(root.right.data);
            adj.get(root.right.data).add(root.data);
            build(root.right);
        }
    }
}
