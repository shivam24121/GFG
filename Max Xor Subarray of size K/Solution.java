class Solution {
    public int maxSubarrayXOR(int[] arr, int k) {
        int n=arr.length;
        int xor=0;
        
        for(int i=0;i<k;i++){
            xor^=arr[i];
        }
        int res=xor;
        
        for(int i=k;i<n;i++){
            xor^=arr[i];
            xor^=arr[i-k];
            
            res=Math.max(res,xor);
        }
        return res;
    }
}
