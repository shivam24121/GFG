class Solution {
    int maxPeopleDefeated(int p) {
        
        long l=0;
        long r=100000;
        
        long ans=0;
        
        while(l<=r){
            long mid=l+(r-l)/2;
            long sumSq=1L*mid*(mid+1)*(2L*mid+1)/6;
            if(sumSq<=p){
                ans=mid;
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return (int)ans;
    }
};
