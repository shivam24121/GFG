class Solution {
    public int minTime(int[] ranks, int n) {
        int min=Integer.MAX_VALUE;
        for(int i:ranks){
            min=Math.min(min,i);
        }
        int r=min*(n*n+1/2);
        int l=0;
        int res=r;
        
        while(l<=r){
            int mid=l+(r-l)/2;
            if(valid(ranks,mid,n)){
                res=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return res;
    }
    public boolean valid(int[] nums,int mid,int n){
        int orders=0;
        for(int i:nums){
            int time=0;
            int made=0;
            
            while(true){
                int timespent=i*(made+1);
                time+=timespent;
                if(time>mid)break;
                made++;
            }
            orders+=made;
            if(orders>=n)return true;
        }
        return false;
    }
}
