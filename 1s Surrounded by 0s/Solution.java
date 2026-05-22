class Solution {
    
    int[] dx={1,0,0,-1};
    int[] dy={0,-1,1,0};
    
    int n;
    int m;
    
    int cntOnes(int[][] grid) {
        
        n=grid.length;
        m=grid[0].length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                
                if(i==0 || i==n-1 || j==0 || j==m-1){
                    solve(i,j,grid);
                }
            }
        }
        int ct=0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    ct++;
                }
            }
        }
        return ct;
    }
    public void solve(int x,int y,int[][] grid){
        
        if(x<0 || x==n || y<0 || y==m || grid[x][y]!=1){
            return;
        }
        grid[x][y]='@';
        
        for(int i=0;i<4;i++){
            
            int xx=x+dx[i];
            int yy=y+dy[i];
            
            solve(xx,yy,grid);
        }
    }
}
