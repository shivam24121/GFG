class Solution {
    
    int n;
    int m;
    int[][] dp;
    
    public int maxDotProduct(int[] a, int[] b) {
        
        n=a.length;
        m=b.length;
        
        dp=new int[n][m];
        
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
        return solve(0,0,a,b);
    }
    public int solve(int idx1,int idx2,int[] a,int[] b){
        
        if(idx1==n){
            return 0;
        }
        if(n-idx1<(m-idx2)){
            return Integer.MIN_VALUE;
        }
        if(idx2==m){
            return 0;
        }
        if(dp[idx1][idx2]!=-1){
            return dp[idx1][idx2];
        }
        
        int res=Integer.MIN_VALUE;
        
        res=Math.max(res,a[idx1]*b[idx2]+solve(idx1+1,idx2+1,a,b));
        res=Math.max(res,solve(idx1+1,idx2,a,b));
        
        return dp[idx1][idx2]=res;
    }
}
