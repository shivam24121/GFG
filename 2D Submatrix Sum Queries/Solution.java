class Solution {
    public ArrayList<Integer> prefixSum2D(int[][] mat, int[][] queries) {
        ArrayList<Integer>res=new ArrayList<>();
        int m=mat.length;
        int n=mat[0].length;
        
        for(int i=0;i<m;i++){
            for(int j=1;j<n;j++){
                mat[i][j]+=mat[i][j-1];
            }
        }
        for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]+=mat[i-1][j];
            }
        }
        for(int[] e:queries){
            int r1=e[0];
            int c1=e[1];
            int r2=e[2];
            int c2=e[3];
            
            int sum=mat[r2][c2];
            int remove=(r1>0?mat[r1-1][c2]:0)+
                       (c1>0?mat[r2][c1-1]:0)-
                       (r1>0 && c1>0?mat[r1-1][c1-1]:0);
            
            res.add(sum-remove);
        }
        return res;
    }
}
