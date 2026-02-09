class Solution {
    public int findKRotation(int arr[]) {
        int n=arr.length;
        
        int l=0,r=n-1;
        int ans=n;
        
        while(l<=r){
            
            if(arr[l]<=arr[r])return l;
            
            int mid=l+(r-l)/2;
            int prev=(mid-1+n)%n;
            int next=(mid+1)%n;
            
            if(arr[mid]<=arr[prev] && arr[mid]<=arr[next]){
                return mid;
            }
            if(arr[mid]>=arr[l]){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return ans;
    }
}
