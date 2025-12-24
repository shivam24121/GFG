class Solution {
    public int countLessEqual(int[] arr, int x) {
        int pivot=find(arr);
        
        int res=bs(arr,0,pivot-1,x)+bs(arr,pivot,arr.length-1,x);
        return res;
        
    }
    public int find(int[] a){
        int l=0,r=a.length-1;
        while(l<r){
            int mid=l+(r-l)/2;
            if(a[mid]>a[r]){
                l=mid+1;
            }
            else{
                r=mid;
            }
        }
        return l;
    }
    public int bs(int[] arr,int l,int r,int x){
        int ans=-1,start=l;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]<=x){
                ans=mid;
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return ans>=start?ans-start+1:0;
    }
}
