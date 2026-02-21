class Solution {
    public int hIndex(int[] city) {
        
        int n=city.length;
        int max=Integer.MIN_VALUE;
        Map<Integer,Integer>map=new HashMap<>();
        for(int i:city){
            max=Math.max(max,i);
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int res=0;
    
        int prefix=map.getOrDefault(0,0);
        for(int i=1;i<=max;i++){
            if((n-prefix)>=i){
                res=i;
            }
            prefix+=map.getOrDefault(i,0);
        }
        return res;
    }
}
