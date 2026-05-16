class Solution {
    public int findSmallest(int[] arr) {
        
        Arrays.sort(arr);
        int n=arr.length;
        
        int ans=1;
        
        for(int i=0;i<n;i++){
            if(ans<arr[i]){
                break;
            }
            ans+=arr[i];
        }
        return ans;
    }
}
