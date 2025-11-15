class Solution {
    
    int[][] dp=new int[103][103];
    
    public int minCutCost(int n, int[] cuts) {
        Arrays.sort(cuts);
        
        int[] temp=new int[cuts.length+2];
        temp[0]=0;
        temp[temp.length-1]=n;
        
        for(int i=0;i<cuts.length;i++){
            temp[i+1]=cuts[i];
        }
        
        for(int i=0;i<103;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(temp,0,temp.length-1);
    }
    public int solve(int[] cuts,int l,int r){
        if(r-l<2)return 0;
        
        if(dp[l][r]!=-1)return dp[l][r];
        
        int res=Integer.MAX_VALUE;
        for(int i=l+1;i<=r-1;i++){
            int cost=cuts[r]-cuts[l]+solve(cuts,l,i)+solve(cuts,i,r);
            res=Math.min(res,cost);
        }
        return dp[l][r]=res;
    }
}
