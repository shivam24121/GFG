class Solution {
    public void sort012(int[] arr) {
        
        // 0-left;
        // 1-mid;
        // 2-right;
        
        int i=0;
        int j=0;
        int k=arr.length-1;
        
        while(j<=k){
            if(arr[j]==0){
                swap(arr,i,j);
                i++;
                j++;
            }
            else if(arr[j]==1){
                j++;
            }
            else{
                swap(arr,j,k);
                k--;
            }
        }
    }
    public void swap(int[] arr,int l,int r){
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }
}
