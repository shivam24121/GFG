class Solution {
    public int maximumSum(int[][] arr, int k) {
        
        int n=arr.length;
        
        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]+=arr[i-1][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                arr[i][j]+=arr[i][j-1];
            }
        }
        int res=Integer.MIN_VALUE;
        
        for(int i=k-1;i<n;i++){
            for(int j=k-1;j<n;j++){
                int curr=arr[i][j];
                if(i-k>=0){
                    curr-=arr[i-k][j];
                }
                if(j-k>=0){
                    curr-=arr[i][j-k];
                }
                if(i-k>=0 && j-k>=0){
                    curr+=arr[i-k][j-k];
                }
                res=Math.max(res,curr);
            }
        }
        return res;
    }
}
