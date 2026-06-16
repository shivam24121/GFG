class Solution {
    public ArrayList<Integer> constructList(int[][] queries) {
        
        int xor=0;
        ArrayList<Integer>list=new ArrayList<>();
        list.add(0);
        
        for(int[] e:queries){
            int type=e[0];
            int val=e[1];
            
            if(type==0){
                list.add(val^xor);
            }
            else{
                xor^=val;
            }
        }
        for(int i=0;i<list.size();i++){
            list.set(i,list.get(i)^xor);
        }
        Collections.sort(list);
        return list;
    }
}
