class Solution {
    public int maxOnes(int arr[], int k) {
        int n=arr.length;
        
        int res=0;
        int zero=0;
        
        int l=0;
        
        for(int r=0;r<n;r++){
            if(arr[r]==0){
                zero++;
            }
            while(zero>k){
                if(arr[l]==0)zero--;
                l++;
            }
            res=Math.max(res,r-l+1);
        }
        return res;
    }
}
