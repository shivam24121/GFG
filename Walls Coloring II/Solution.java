class Solution {
    int minCost(int[][] costs) {
        int m=costs.length;
        int n=costs[0].length;
        int[][] dp=new int[m][n];
        if(n==1 && m!=1)return -1;
        
        int min=Integer.MAX_VALUE,secMin=Integer.MAX_VALUE;
        
        for(int j=0;j<n;j++){
            dp[0][j]=costs[0][j];
            
            if(dp[0][j]<=min){
                secMin=min;
                min=dp[0][j];
            }
            else if(dp[0][j]<secMin){
                secMin=dp[0][j];
            }
        }
        for(int i=1;i<m;i++){
            int nMin=Integer.MAX_VALUE,nSecMin=Integer.MAX_VALUE;
            for(int j=0;j<n;j++){
                if(dp[i-1][j]==min){
                    dp[i][j]=costs[i][j]+secMin;
                }
                else{
                    dp[i][j]=costs[i][j]+min;
                }
                if(dp[i][j]<=nMin){
                    nSecMin=nMin;
                    nMin=dp[i][j];
                }
                else if(dp[i][j]<nSecMin){
                    nSecMin=dp[i][j];
                }
            }
            min=nMin;
            secMin=nSecMin;
        }
        return min;
    }
}
