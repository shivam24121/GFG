class Solution {
    
    int n;
    int m;
    int[] dx={1,0,0,-1};
    int[] dy={0,-1,1,0};
    
    public int longestPath(int[][] mat, int xs, int ys, int xd, int yd) {
        
        n=mat.length;
        m=mat[0].length;
        
        boolean[][] vis=new boolean[n][m];
        
        if(mat[xs][ys]==0 || mat[xd][yd]==0){
            return -1;
        }
        int res=dfs(xs,ys,xd,yd,mat,vis);
        return res<0?-1:res;
    }
    public int dfs(int x,int y,int endX,int endY,int[][] grid,boolean[][] vis){
        
        if(x==endX && y==endY){
            return 0;
        }
        int res=-(int)1e6;
        vis[x][y]=true;
        
        for(int i=0;i<4;i++){
            
            int xx=x+dx[i];
            int yy=y+dy[i];
            
            if(xx<0 || xx==n || yy<0 || yy==m || vis[xx][yy] || grid[xx][yy]!=1){
                continue;
            }
            res=Math.max(res,1+dfs(xx,yy,endX,endY,grid,vis));
        }
        vis[x][y]=false;
        return res;
    }
}
