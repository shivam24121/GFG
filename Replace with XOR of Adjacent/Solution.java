class Solution {
    public void replaceElements(int[] arr) {
        
        int[] temp=arr.clone();
        
        int n=arr.length;
        
        arr[0]=temp[0]^temp[1];
        arr[n-1]=temp[n-1]^temp[n-2];
        
        for(int i=1;i<n-1;i++){
            arr[i]=temp[i-1]^temp[i+1];
        }
    }
}
