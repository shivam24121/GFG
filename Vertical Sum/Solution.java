
class Solution {
    public ArrayList<Integer> verticalSum(Node root) {
       
       Map<Integer,Integer>map=new HashMap<>();
       solve(root,0,map);
       
       ArrayList<Map.Entry<Integer,Integer>>res=new ArrayList<>(map.entrySet());
       Collections.sort(res,(a,b)->a.getKey()-b.getKey());
       
       ArrayList<Integer>ans=new ArrayList<>();
       
       for(int i=0;i<res.size();i++){
           ans.add(res.get(i).getValue());
        //   System.out.println(res.get(i));
       }
       
       return ans;
    }
    public void solve(Node root,int idx,Map<Integer,Integer>map){
        if(root==null)return;
        map.put(idx,map.getOrDefault(idx,0)+root.data);
        
        solve(root.left,idx-1,map);
        solve(root.right,idx+1,map);
    }
}
