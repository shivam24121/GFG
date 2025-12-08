class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        int n=arr.length;
        int res=Integer.MIN_VALUE;
        
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        res=sum;
        for(int i=1;i<n-k+1;i++){
            sum+=arr[i+k-1]-arr[i-1];
            res=Math.max(res,sum);
        }
        return res;
    }
}
