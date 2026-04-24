class Solution {
    public int visibleBuildings(int arr[]) {
        
        int ct=1;
        int prev=arr[0];
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=prev){
                ct++;
                prev=arr[i];
            }
        }
        return ct;
    }
}
