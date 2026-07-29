class Solution {
    int minSubsets(int arr[]) {
        
        int n=arr.length;
        Arrays.sort(arr);
        
        int res=1;
        
        for(int i=1;i<n;i++){
            if(arr[i]-1!=arr[i-1]){
                res++;
            }
        }
        return res;
    }
}
