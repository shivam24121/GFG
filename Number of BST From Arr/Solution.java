class Solution {
    public ArrayList<Integer> countBSTs(int[] arr) {
        
        int n=arr.length;
        
        int[] dp=catalan(n);
        
        int[] copy=arr.clone();
        Arrays.sort(copy);
        
        ArrayList<Integer>res=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            int L=bs(copy,arr[i]);
            int R=n-L-1;
            res.add(dp[L]*dp[R]);
        }
        
        return res;
    }
    public int bs(int[] arr,int x){
        int l=0,r=arr.length-1;
        int ans=0;
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
        return ans==0?0:ans;
    }
    int[] catalan(int n){
        
        int[] dp=new int[n+1];
        dp[0]=dp[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=0;j<i;j++){
                dp[i]+=dp[j]*dp[i-j-1];
            }
        }
        // for(int i=0;i<=n;i++){
        //     System.out.print(dp[i]+" ");
        // }
        
        return dp;
    }
}

