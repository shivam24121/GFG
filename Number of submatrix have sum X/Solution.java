class Solution {
    public int countSquare(int[][] mat, int x) {
        
        int n=mat.length;
        int m=mat[0].length;
        
        int[][] pref=new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                pref[i][j]=mat[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<m;j++){
                pref[i][j]+=pref[i][j-1];
            }
        }
        for(int j=0;j<m;j++){
            for(int i=1;i<n;i++){
                pref[i][j]+=pref[i-1][j];
            }
        }
        int ct=0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                for(int off=1;off<=Math.min(n-i,m-j);off++){
                    
                    int r1=i;
                    int c1=j;
                    int r2=r1+off-1;
                    int c2=c1+off-1;
                    
                    int sum=pref[r2][c2];
                    
                    if(r1>0)sum-=pref[r1-1][c2];
                    if(c1>0)sum-=pref[r2][c1-1];
                    if(r1>0 && c1>0)sum+=pref[r1-1][c1-1];
                    
                    if(sum==x)ct++;
                }
            }
        }
        return ct;
    }
}
