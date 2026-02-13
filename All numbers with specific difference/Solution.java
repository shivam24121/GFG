class Solution {
    public int getCount(int n, int d) {
        
        int l=0,r=n;
        int ans=-1;
        
        while(l<=r){
            int mid=l+(r-l)/2;
            if(valid(mid,d)){
                ans=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        if(ans==-1)return 0;
        return n-ans+1;
    }
    public boolean valid(int n , int d){
        
        int temp=n;
        int sum=0;
        
        while(temp>0){
            sum+=temp%10;
            temp/=10;
        }
        return (n-sum)>=d;
    }
}
