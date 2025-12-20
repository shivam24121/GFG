class Solution {
    public int searchInsertK(int arr[], int k){
        int n=arr.length;
        int res=n;
        int left=0,right=n-1;
        
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==k){
                return mid;
            }
            else if(arr[mid]>k){
                res=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return res;
    }
};
