class Solution {
    public boolean isMaxHeap(int[] arr) {
        
        int n=arr.length;
        
        for(int i=0;i<arr.length;i++){
            
            int curr=arr[i];
            int l=2*i+1<n?arr[2*i+1]:0;
            int r=2*i+2<n?arr[2*i+2]:0;
            
            if(curr<l || curr<r){
                return false;
            }
        }
        return true;
    }
}
