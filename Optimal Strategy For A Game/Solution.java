class Solution {
    Integer[][] dp;
    public int maximumAmount(int arr[]) {
        int n=arr.length;
        dp=new Integer[n][n];
        return solve(arr,0,n-1);
    }
    public int solve(int[] arr,int l,int r){
        if(l==r)return arr[l];
        if(l>r)return 0;
        if(dp[l][r]!=null)return dp[l][r];
        
        int left=arr[l]+Math.min(solve(arr,l+1,r-1),solve(arr,l+2,r));
        int right=arr[r]+Math.min(solve(arr,l+1,r-1),solve(arr,l,r-2));
        return dp[l][r]=Math.max(left,right);
    }
}
