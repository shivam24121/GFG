class Solution {
    static Boolean isSubsetSum(int arr[], int sum) {
        Boolean[][] dp=new Boolean[arr.length][sum+1];
        return solve(arr,0,sum,dp);
    }
    public static Boolean solve(int[] arr,int idx,int sum,Boolean[][] dp){
        if(sum==0)return true;
        if(idx==arr.length)return false;
        if(dp[idx][sum]!=null)return dp[idx][sum];
        boolean a=solve(arr,idx+1,sum,dp);
        boolean b=false;
        if(arr[idx]<=sum){
            b=solve(arr,idx+1,sum-arr[idx],dp);
        }
        return dp[idx][sum]=a||b; 
    }
}
