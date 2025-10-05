class Solution {
    public ArrayList<String> ratInMaze(int[][] maze) {
        ArrayList<String>res=new ArrayList<>();
        int n=maze.length;
        if(maze[0][0]==0 || maze[n-1][n-1]==0)return res;
        boolean[][] check=new boolean[n][n];
        dfs(0,0,n,"",maze,check,res);
        Collections.sort(res);
        return res;
    }
    public boolean isValid(int x,int y,int n,int[][] maze,boolean[][] check){
        return x>=0 && x<n && y>=0 && y<n 
               && maze[x][y]==1 
               && check[x][y]==false;
    }
    public void dfs(int x,int y,int n,String s,int[][] maze,boolean[][] check,ArrayList<String>res){
        if(x==n-1 && y==n-1){
            res.add(s);
            return; 
        }
        check[x][y]=true;
        
        int[] dirX={1,0,0,-1};
        int[] dirY={0,-1,1,0};
        char[] c={'D','L','R','U'};
        
        for(int i=0;i<4;i++){
            int xx=x+dirX[i];
            int yy=y+dirY[i];
            
            if(isValid(xx,yy,n,maze,check)){
                dfs(xx,yy,n,s+c[i],maze,check,res);
            }
        }
        check[x][y]=false;
    }
}
