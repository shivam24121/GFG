class Solution {
    public int countSubset(int[] arr, int k) {
        
        int n=arr.length;
        int mid=n/2;
        
        int[] a=Arrays.copyOfRange(arr,0,mid);
        int[] b=Arrays.copyOfRange(arr,mid,n);
        
        int total=1<<mid;
        int ans=0;
        
        Map<Long,Integer>map=new HashMap<>();
        
        for(int mask=0;mask<total;mask++){
            long sum=0;
            for(int i=0;i<a.length;i++){
                if((mask & (1<<i))!=0){
                    sum+=a[i];
                }
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        for(int mask=0;mask<(1<<n-mid);mask++){
            long sum=0;
            for(int i=0;i<b.length;i++){
                if((mask & (1<<i))!=0){
                    sum+=b[i];
                }
            }
            ans+=map.getOrDefault(k-sum,0);
        }
        return ans;
    }
}
