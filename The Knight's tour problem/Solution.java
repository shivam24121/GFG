class Solution {
    static int[] X={2,1,-1,-2,-2,-1,1,2};
    static int[] Y={1,2,2,1,-1,-2,-2,-1};
    public ArrayList<ArrayList<Integer>> knightTour(int n) {
        int[][] grid=new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(grid[i],-1);
        }
        grid[0][0]=0;
        if(solve(grid,0,0,1,n)){
            ArrayList<ArrayList<Integer>>res=new ArrayList<>();
            for(int i=0;i<n;i++){
                ArrayList<Integer>temp=new ArrayList<>();
                for(int j=0;j<n;j++){
                    temp.add(grid[i][j]);
                }
                res.add(temp);
            }
            return res;
        }
        else{
            return new ArrayList<>();
        }
    }
    public static boolean solve(int[][] grid,int i,int j,int exp,int n){
        if(n*n==exp)return true;
        
        for(int x=0;x<8;x++){
            int ii=i+X[x];
            int jj=j+Y[x];
            if(valid(ii,jj,grid,n)){
                grid[ii][jj]=exp;
                if(solve(grid,ii,jj,exp+1,n)){
                    return true;
                }
                grid[ii][jj]=-1;
            }
        }
        return false;
    }
    public static boolean valid(int i,int j,int[][] grid,int n){
        return i>=0 && i<n && j>=0 && j<n && grid[i][j]==-1;
    }
}
