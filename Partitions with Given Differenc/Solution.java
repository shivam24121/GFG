class Solution {
    
    int[][] dp;
    int n;
    
    public int countPartitions(int[] arr, int diff) {
        
        n=arr.length;
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        
        dp=new int[n][sum];
        
        int k=(sum-diff)/2;
        
        if((sum-diff)%2==1 || diff>sum)return 0;
        
        for(int[] i:dp){
            Arrays.fill(i,-1);
        }
        return solve(n-1,k,arr);
    }
    public int solve(int idx,int sum,int[] arr){
        
        if(idx==0){
            if(sum==0 && arr[idx]==0)return 2;
            if(sum==0 || arr[idx]==sum)return 1;
            return 0;
        }
        if(dp[idx][sum]!=-1){
            return dp[idx][sum];
        }
        int skip=solve(idx-1,sum,arr);
        int pick=0;
        if(arr[idx]<=sum){
            pick=solve(idx-1,sum-arr[idx],arr);
        }
        return dp[idx][sum]=skip+pick;
    }
}
