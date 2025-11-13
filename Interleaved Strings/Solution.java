class Solution {
    
    Boolean[][] dp;
    int n,m,N;
    
    public boolean isInterleave(String s1, String s2, String s3) {
        n=s1.length();
        m=s2.length();
        N=s3.length();
        
        if(m+n!=N)return false;
        dp=new Boolean[n+1][m+1];
        
        return solve(0,0,s1,s2,s3);
    }
    public boolean solve(int i,int j,String s1,String s2,String s3){
        if(i==n && j==m && i+j==N)return true;
        
        if(i+j>N)return false;
        
        if(dp[i][j]!=null)return dp[i][j];
        
        boolean a=false,b=false;
        
        if(i<n && s1.charAt(i)==s3.charAt(i+j)){
            a=solve(i+1,j,s1,s2,s3);
        }
        if(j<m && s2.charAt(j)==s3.charAt(i+j)){
            b=solve(i,j+1,s1,s2,s3);
        }
        return dp[i][j]=a||b;
    }
}
