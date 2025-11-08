class Solution {
    
    int[][][] t;
    
    public int numberOfPath(int[][] mat, int k) {
        int m=mat.length;
        int n=mat[0].length;
        
        t=new int[m+1][n+1][k+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                for(int l=0;l<=k;l++){
                    t[i][j][l]=-1;
                }
            }
        }
        return solve(mat,0,0,m,n,k);
    }
    public int solve(int[][] mat,int row,int col,int m,int n,int k){
        if(row<0 || row>=m || col<0 || col>=n )return 0;
        if(k<0)return 0;
        
        if(t[row][col][k]!=-1)return t[row][col][k];
        
        if(row==m-1 && col==n-1 && mat[row][col]==k){
            return 1;
        }
        
        int left=solve(mat,row+1,col,m,n,k-mat[row][col]);
        int right=solve(mat,row,col+1,m,n,k-mat[row][col]);
        
        return t[row][col][k]=left+right;
    }
}
