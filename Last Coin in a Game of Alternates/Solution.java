class Solution {
    public int coin(int[] arr) {
        
        int n=arr.length;
        
        int i=0;
        int j=n-1;
        
        for(int x=0;x<n-1;x++){
            if(arr[i]<=arr[j]){
                j--;
            }
            else{
                i++;
            }
        }
        return arr[i];
    }
}
