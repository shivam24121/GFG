class Solution {
    public int LCIS(int[] a, int[] b) {
        int n=a.length;
        int m=b.length;
        int[] dp=new int[m];
        int res=0;
        
        for(int i=0;i<n;i++){
            int currMax=0;
            for(int j=0;j<m;j++){
                if(a[i]>b[j]){
                    currMax=Math.max(currMax,dp[j]);
                }
                else if(a[i]==b[j]){
                    dp[j]=Math.max(dp[j],currMax+1);
                    res=Math.max(res,dp[j]);
                }
            }
        }
        return res;
    }
}
