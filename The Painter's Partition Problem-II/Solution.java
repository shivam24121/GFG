class Solution {
    public int minTime(int[] arr, int k) {
        int sum=0;
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        
        for(int i:arr){
            sum+=i;
            max=Math.max(max,i);
        }
        int l=max,r=sum;
        int ans=sum;
        
        while(l<=r){
            int mid=l+(r-l)/2;
            if(valid(arr,k,mid)){
                //System.out.println(mid+" ");
                ans=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
    public boolean valid(int[] arr,int k,int mid){
        int sum=0;
        int ct=1;
        
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]>mid){
                ct++;
                sum=arr[i];
            }
            else{
                sum+=arr[i];
            }
        }
        return ct<=k;
    }
}
