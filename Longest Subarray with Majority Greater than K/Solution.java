class Solution {
    public int longestSubarray(int[] arr, int k) {
        
        int n=arr.length;
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        int sum=0;
        int res=0;
        
        for(int i=0;i<n;i++){
            if(arr[i]>k){
                sum++;
            }
            else{
                sum--;
            }
            if(sum>0){
                res=i+1;
            }
            if(map.containsKey(sum-1)){
                res=Math.max(res,i-map.get(sum-1));
            }
            else if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return res;
    }
}
