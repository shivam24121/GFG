class Solution {
    void segregate0and1(int[] arr) {
        
        int n=arr.length;
        
        int i=0,j=n-1;
        
        while(i<j){
            if(arr[i]==1){
                swap(arr,i,j);
                j--;
            }
            else{
                i++;
            }
        }
    }
    public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
