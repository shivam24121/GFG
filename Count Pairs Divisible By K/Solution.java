class Solution {
    public long countKdivPairs(int[] arr,int k){
        long ans=0;
        int[] cnt=new int[k];

        for(int x:arr){
            int r=x%k;
            int need=(k-r)%k;
            ans+=cnt[need];
            cnt[r]++;
        }

        return ans;
    }
}
