class Solution {
    public int equalSumSpan(int[] a1, int[] a2) {
        int n=a1.length;
        for(int i=1;i<n;i++){
            a1[i]=a1[i]+a1[i-1];
        }
        for(int i=1;i<n;i++){
            a2[i]=a2[i]+a2[i-1];
        }
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        int res=0;
        for(int i=0;i<n;i++){
            int diff=a1[i]-a2[i];
            if(map.containsKey(diff)){
                res=Math.max(res,i-map.get(diff));
            }
            else{
                map.put(diff,i);
            }
        }
        return res;
    }
}
