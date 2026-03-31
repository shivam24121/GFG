class Solution {
    
    int[][] dp;
    
    public int maxProfit(int arr[], int k) {
        
        int n=arr.length;
        
        dp=new int[n+1][3];
        
        for(int[] i:dp){
            Arrays.fill(i,-1);
        }
        
        return solve(0,0,arr,k);
    }
    public int solve(int idx,int state,int[] arr,int k){
        
        if(idx==arr.length)return 0;
        
        if(dp[idx][state]!=-1)return dp[idx][state];
        
        int take=0;
        int skip=0;
        
        if(state==0){
            take=Math.max(take,-arr[idx]+solve(idx+1,1,arr,k));
            skip=Math.max(skip,solve(idx+1,0,arr,k));
        }
        else{
            take=Math.max(take,arr[idx]-k+solve(idx+1,0,arr,k));
            skip=Math.max(skip,solve(idx+1,1,arr,k));
        }
        return dp[idx][state]=Math.max(take,skip);
    }
}
