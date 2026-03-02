class Solution {
    public int maxWater(int arr[]) {
        
        int l=0,r=arr.length-1;
        int water=0;
        int lMax=Integer.MIN_VALUE;
        int rMax=Integer.MIN_VALUE;
        
        while(l<r){
            if(arr[l]<=arr[r]){
                if(arr[l]>lMax){
                    lMax=arr[l];
                }
                else{
                    water+=lMax-arr[l];
                }
                l++;
            }
            else{
                if(arr[r]>rMax){
                    rMax=arr[r];
                }
                else{
                    water+=rMax-arr[r];
                }
                r--;
            }
        }
        return water;
    }
}
