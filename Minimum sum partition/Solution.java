class Solution {
    
    int[][] dp;
    int min=Integer.MAX_VALUE;
    int Totalsum;
    
    public int minDifference(int arr[]) {
        int n=arr.length;
        Totalsum=0;
        for(int i:arr){
            Totalsum+=i;
        }
        dp=new int[n+1][Totalsum+1];
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(0,arr,0);
    }
    public int solve(int idx,int[] arr,int sum){
        if(idx>=arr.length){
            return Math.abs((Totalsum-sum)-sum);
        };
        
        if(dp[idx][sum]!=-1)return dp[idx][sum];
        
        int pick=solve(idx+1,arr,sum+arr[idx]);
        int skip=solve(idx+1,arr,sum);
        int mini=Math.min(pick,skip);
        return dp[idx][sum]=mini;
    }
}
