class Solution {
    public long subarrayXor(int arr[], int k) {
        int n=arr.length;
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int res=0;
        int xor=0;
        for(int i=0;i<n;i++){
            xor^=arr[i];
            res+=map.getOrDefault(xor^k,0);
            map.put(xor,map.getOrDefault(xor,0)+1);
        }
        return res;
    }
}
