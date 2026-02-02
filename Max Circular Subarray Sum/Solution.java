class Solution {
    public int maxCircularSum(int arr[]) {
        int n=arr.length;
        
        int currSum=arr[0];
        int maxSum=arr[0];
        
        int total=arr[0];
        
        int currMin=arr[0];
        int minSum=arr[0];
        
        for(int i=1;i<arr.length;i++){
            currSum=Math.max(currSum+arr[i],arr[i]);
            maxSum=Math.max(maxSum,currSum);
            
            currMin=Math.min(currMin+arr[i],arr[i]);
            minSum=Math.min(minSum,currMin);
            
            total+=arr[i];
            
        }
        if(maxSum<0)return maxSum;
        return Math.max(total-minSum,maxSum);
    }
}
