class Solution {
    
    int n;
    int[][] dp;
    
    public int minCost(int[][] arr) {
        
        n=arr.length;
        dp=new int[n+1][3];
        
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }
        return solve(0,-1,arr);
    }
    public int solve(int idx,int choice,int[][] arr){
        
        if(idx==n){
            return 0;
        }
        if(choice!=-1 && dp[idx][choice]!=-1){
            return dp[idx][choice];
        }
        int res=Integer.MAX_VALUE;
        
        if(choice!=0){
            res=Math.min(res,arr[idx][0]+solve(idx+1,0,arr));
        }
        if(choice!=1){
            res=Math.min(res,arr[idx][1]+solve(idx+1,1,arr));
        }
        if(choice!=2){
            res=Math.min(res,arr[idx][2]+solve(idx+1,2,arr));
        }
        if(choice!=-1){
            dp[idx][choice]=res;
        }
        return res;
    }
}
