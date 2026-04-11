class Solution {
    public int countIncreasing(int[] arr) {
        
        int n=arr.length;
        
        int res=0;
        int curr=0;
        
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                curr++;
                res+=curr;
            }
            else{
                curr=0;
            }
        }
        return res;
    }
}
