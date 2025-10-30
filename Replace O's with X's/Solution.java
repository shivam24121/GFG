class Solution {
    
    static int[] dx={0,1,-1,0};
    static int[] dy={1,0,0,-1};
    
    public static void fill(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        
        for(int i=0;i<m;i++){
            if(grid[i][0]=='O'){
                dfs(i,0,grid);
            }
            if(grid[i][n-1]=='O'){
                dfs(i,n-1,grid);
            }
        }
        
        for(int i=0;i<n;i++){
            if(grid[0][i]=='O'){
                dfs(0,i,grid);
            }
            if(grid[m-1][i]=='O'){
                dfs(m-1,i,grid);
            }
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='O'){
                    grid[i][j]='X';
                }
                if(grid[i][j]=='1'){
                    grid[i][j]='O';
                }
            }
        }
        
    }
    public static void dfs(int x,int y,char[][] grid){
        if(x>=0 && x<grid.length && y>=0 && y<grid[0].length && grid[x][y]=='O'){
            grid[x][y]='1';
            
            for(int i=0;i<4;i++){
                int xx=x+dx[i];
                int yy=y+dy[i];
                dfs(xx,yy,grid);
            }
        }
    }
}
