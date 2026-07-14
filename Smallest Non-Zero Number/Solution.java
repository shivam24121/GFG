class Solution {
    public int find(int[] arr) {
        
        long l=1;
        long r=(int)1e6;
        
        long res=(int)1e7;
        
        while(l<=r){
            long mid=l+(r-l)/2;
            if(valid(arr,mid)){
                res=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return (int)res;
    }
    public boolean valid(int[] nums,long x){
        
        int n=nums.length;
        for(int i=0;i<n;i++){
            
            if(x>=(long)1e17){
                return true;
            }
            
            long diff=Math.abs(x-nums[i]);
            
            if(nums[i]>x){
                x-=diff;
                if(x<0){
                    return false;
                }
            }
            else{
                x+=diff;
            }
        }
        return x>=0;
    }
}
