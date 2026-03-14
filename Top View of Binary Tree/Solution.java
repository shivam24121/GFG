class Solution {
    public ArrayList<Integer> topView(Node root) {
        ArrayList<Integer>res=new ArrayList<>();
        Map<Integer,int[]>map=new HashMap<>();
        solve(root,0,1,map);
        for(int i=-100000;i<=100000;i++){
            if(map.containsKey(i)==false)continue;
            res.add(map.get(i)[0]);
        }
        return res;
    }
    public void solve(Node root,int pos,int lvl,Map<Integer,int[]>map){
        if(root==null)return;
        if(!map.containsKey(pos)){
            map.put(pos,new int[]{root.data,lvl});
        }
        if(map.containsKey(pos)){
            if(lvl<map.get(pos)[1]){
                map.put(pos,new int[]{root.data,lvl});
            }
        }
        solve(root.left,pos-1,lvl+1,map);
        solve(root.right,pos+1,lvl+1,map);
    }
}


/* 

                    1(0)
                
                
            2(-1)          3(1)


    3(-2)         6(0) 9(0)        10(2)


*/
