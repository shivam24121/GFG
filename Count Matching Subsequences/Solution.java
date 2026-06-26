class Solution {
    
    static int[][] dp;
    static int n;
    static int m;
    static int mod=(int)1e9+7;
    
    public static int countWays(String s1, String s2) {
        
        n=s1.length();
        m=s2.length();
        
        dp=new int[n+1][m+1];
        
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }
        return solve(0,0,s1,s2);
    }
    static int solve(int idx1,int idx2,String s1,String s2){
        
        if(idx2==m){
            return 1;
        }
        if(idx1==n){
            return idx2==m?1:0;
        }
        if(dp[idx1][idx2]!=-1){
            return dp[idx1][idx2];
        }
        int res=0;
        
        if(s1.charAt(idx1)==s2.charAt(idx2)){
            res=(res+solve(idx1+1,idx2+1,s1,s2))%mod;
        }
        res=(res+solve(idx1+1,idx2,s1,s2))%mod;
        
        return dp[idx1][idx2]=res;
    }
}
