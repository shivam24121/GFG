class Solution {
    
    int dp[][][];
    int n;
    
    public int chocolatePickup(int[][] mat) {
        n=mat.length;
        dp=new int[n][n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        int res=solve(mat,0,0,0);
        return Math.max(0,res);
    }
    public int solve(int[][] grid,int r1,int c1,int r2){
        int c2=(r1+c1)-r2;
        
        if(r1>=n || c2>=n || r2>=n || c1>=n ||
            grid[r1][c1]==-1 || grid[r2][c2]==-1)return Integer.MIN_VALUE;
          
        if(r1==n-1 && c1==n-1)return grid[r1][c1];
        
        if(dp[r1][c1][r2]!=-1)return dp[r1][c1][r2];
        
        int res=0;
        if(r1==r2 && c1==c2){
            res+=grid[r1][c1];
        }
        else{
            res+=grid[r1][c1]+grid[r2][c2];
        }
        
        int next=Math.max(
            Math.max(solve(grid,r1+1,c1,r2+1),solve(grid,r1+1,c1,r2)),
            Math.max(solve(grid,r1,c1+1,r2),solve(grid,r1,c1+1,r2+1))
            );
                                    
        return dp[r1][c1][r2]=res+next;
    }
}
