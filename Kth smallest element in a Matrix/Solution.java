class Solution {
    public int kthSmallest(int[][] mat, int k) {
        int n=mat.length;
        int l=mat[0][0];
        int r=mat[n-1][n-1];
        int ans=-1;
        
        while(l<=r){
            int mid=l+(r-l)/2;
            int greater=solve(mat,mid);
            
            if(greater<k){
                l=mid+1;
            }
            else{
                ans=mid;
                r=mid-1;
            }
        }
        return ans;
    }
    public int solve(int[][] mat,int x){
        int n=mat.length;
        int row=0,col=n-1;
        int ct=0;
        
        while(row<n && col>=0){
            if(mat[row][col]<=x){
                ct+=(col+1);
                row++;
            }
            else{
                col--;
            }
        }
        return ct;
    }
}
