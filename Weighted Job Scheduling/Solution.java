class Solution {
    
    int n;
    int[] t;
    
    public int maxProfit(int[][] jobs) {
        n=jobs.length;
        t=new int[n+1];
        Arrays.fill(t,-1);
        Arrays.sort(jobs,(a,b)->a[0]-b[0]);
        
        return solve(jobs,0);
    }
    public int solve(int[][] a,int idx){
        if(idx>=n)return 0;
        
        if(t[idx]!=-1)return t[idx];
        
        int next=bs(a,idx+1,a[idx][1]);
        int take=a[idx][2]+solve(a,next);
        int skip=solve(a,idx+1);
        
        return t[idx]=Math.max(take,skip);
    }
    public int bs(int[][] a,int l,int target){
        int r=n-1;
        int res=n+1;
        
        while(l<=r){
            int mid=l+(r-l)/2;
            if(a[mid][0]>=target){
                res=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return res;
    }
}
