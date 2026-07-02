class Solution {
    
    Integer[][] dp;
    int n;
    int mod;
    
    public boolean divisibleByK(int[] arr, int k) {
        
        n=arr.length;
        mod=k;
        
        dp=new Integer[n][k+1];
        
        return solve(0,k,arr);
    }
    public boolean solve(int idx,int k,int[] arr){
        
        if(idx==n){
            return k==0?true:false;
        }
        if(k==0){
            return true;
        }
        if(dp[idx][k]!=null){
            return dp[idx][k]==1?true:false;
        }
        int nextK=((k-arr[idx])%mod+mod)%mod;
        boolean take=solve(idx+1,nextK,arr);
        
        boolean skip=solve(idx+1,k,arr);
        
        dp[idx][k]=((take|skip)?1:0);
        return take|skip;
    }
}
