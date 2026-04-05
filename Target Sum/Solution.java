class Solution {
    
    int[][] dp;
    int n;
    int offset;
    
    public int totalWays(int[] arr, int target) {
       
        n=arr.length;
        
        int sum=Arrays.stream(arr).sum();
        offset=sum;
        
        dp=new int[n+1][sum+1+offset];
        
       for(int[] a:dp){
            Arrays.fill(a,-1);
       }
        return solve(0,0,arr,target);
    }
    public int solve(int idx,int sum,int[] arr,int k){
        
        if(idx==n){
            return sum==k?1:0;
        }
        if(dp[idx][sum+offset]!=-1){
            return dp[idx][sum+offset];
        }
        int pick=solve(idx+1,sum+arr[idx],arr,k);
        
        int skip=solve(idx+1,sum-arr[idx],arr,k);
        
        return dp[idx][sum+offset]=pick+skip;
    }
}
