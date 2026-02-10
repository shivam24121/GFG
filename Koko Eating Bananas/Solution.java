class Solution {
    public int kokoEat(int[] arr, int k) {
        int n=arr.length;
        int max=Arrays.stream(arr).max().getAsInt();
        int l=1,r=max;
        int ans=max;
        
        while(l<=r){
            int mid=l+(r-l)/2;
            if(valid(arr,mid,k)){
                ans=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
    public boolean valid(int[] arr,int mid,int k){
        int res=0;
        for(int i:arr){
            res+=(i+mid-1)/mid;
        }
        return res<=k;
    }
}
