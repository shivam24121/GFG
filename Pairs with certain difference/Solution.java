class Solution {
    public int sumDiffPairs(int[] arr, int k) {
        
        int n=arr.length;
        
        int res=0;
        
        Arrays.sort(arr);
        
        for(int i=n-1;i>=1;i--){
            int diff=arr[i]-arr[i-1];
            if(diff<k){
                res+=(arr[i]+arr[i-1]);
                i--;
            }
        }
        return res;
    }
}
