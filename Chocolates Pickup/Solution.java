class Solution {
    
    int n,m;
    int[][][] dp;
    int[] dy={-1,0,1};
    
    public int maxChocolate(int grid[][]) {
        
        n=grid.length;
        m=grid[0].length;
        
        dp=new int[n][m][m];
        for(int[][] i:dp){
            for(int[] j:i){
                Arrays.fill(j,-1);
            }
        }
        return solve(0,0,m-1,grid);
    }
    public int solve(int r1,int c1,int c2,int[][] grid){
        
        if(r1==n-1){
            return c1==c2?grid[r1][c1]:grid[r1][c1]+grid[r1][c2];
        }
        if(dp[r1][c1][c2]!=-1){
            return dp[r1][c1][c2];
        }
        int res=0;
        int curr=c1==c2?grid[r1][c1]:grid[r1][c1]+grid[r1][c2];
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                int Nextc1=c1+dy[i];
                int Nextc2=c2+dy[j];
                if(Nextc1<0 || Nextc1>=m || Nextc2<0 || Nextc2>=m)continue;
                res=Math.max(res,curr+solve(r1+1,Nextc1,Nextc2,grid));
            }
        }
        return dp[r1][c1][c2]=res;
    }
}
