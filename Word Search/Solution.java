class Solution {
    
    static int[] dx={1,0,0,-1};
    static int[] dy={0,1,-1,0};
    
    public boolean isWordExist(char[][] mat, String word) {
        
        int n=mat.length;
        int m=mat[0].length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==word.charAt(0)){
                    if(solve(mat,i,j,word,0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean solve(char[][] mat,int x,int y,String target,int idx){
        if(x<0 || x>=mat.length || y<0 || y>=mat[0].length || mat[x][y]!=target.charAt(idx)){
            return false;
        }
        if(idx==target.length()-1){
            return true;
        }
        char temp=mat[x][y];
        mat[x][y]='*';
        for(int i=0;i<4;i++){
            int xx=x+dx[i];
            int yy=y+dy[i];
            if(solve(mat,xx,yy,target,idx+1)){
                return true;
            }
        }
        mat[x][y]=temp;
        return false;
    }
}
