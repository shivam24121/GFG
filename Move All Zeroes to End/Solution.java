class Solution {
    void pushZerosToEnd(int[] arr) {
        int n=arr.length;
        int i=0,j=0;
        
        while(j<n){
            if(arr[j]!=0){
                swap(arr,i,j);
                i++;
            }
            j++;
        }
    }
    public void swap(int[] a,int l,int r){
        int temp=a[l];
        a[l]=a[r];
        a[r]=temp;
    }
}
