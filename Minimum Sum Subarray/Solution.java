class Solution {
    public int minSubarraySum(int[] arr) {
        
        // int min=arr[0];
        int curr=arr[0];
        int res=arr[0];
        
        for(int i=1;i<arr.length;i++){
            
            // min=Math.min(min,arr[i]);
            curr=Math.min(curr+arr[i],arr[i]);
            res=Math.min(res,curr);
        }
        // return res==0?min:res;
        return res;
    }
}
