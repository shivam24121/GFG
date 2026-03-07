class Solution {
    static int noOfWays(int m, int n, int x) {
        
        int[][] dp =new int[n+1][x+1];
        dp[0][0]=1;
        
        for(int dice=1;dice<=n;dice++){
            for(int j=1;j<=x;j++){
                for(int face=1;face<=m;face++){
                    if(j-face>=0){
                        dp[dice][j]+=dp[dice-1][j-face];
                    }
                }
            }
        }
        return dp[n][x];
    }
}
