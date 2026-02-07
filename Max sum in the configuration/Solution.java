class Solution {
    int maxSum(int[] arr) {
        int n=arr.length;
        
        int curr=0;
        int sum=0;
        
        for(int i=0;i<n;i++){
            curr+=i*(arr[i]);
            sum+=arr[i];
        }
        int max=curr;
        
        for(int i=0;i<n;i++){
            int temp=curr+sum-(n*(arr[n-i-1]));
            max=Math.max(max,curr);
            curr=temp;
        }
        return max;
    }
}
