class Solution {
    int[] dp;
    int max=(int)1e9;
    public int minimumCost(int[] cost, int w) {
        dp=new int[w+1];
        Arrays.fill(dp,max);
        int res=solve(w,cost);
        return res==max?-1:res;
    }
    public int solve(int weight,int[] arr){
        
        if(weight==0){
            return 0;
        }
        if(weight<0){
            return max;
        }
        if(dp[weight]!=max){
            return dp[weight];
        }
        int res=max;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==-1 || (i+1)>weight){
                continue;
            }
            res=Math.min(res,arr[i]+solve(weight-(i+1),arr));
        }
        return dp[weight]=Math.min(dp[weight],res);
    }
}
