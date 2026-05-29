class Solution {
    
    int[][] dp;
    
    public int validGroups(String s) {
        
        int n=s.length();
        
        dp=new int[n][n*10];
        
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }
        
        return solve(0,0,s);
    }
    public int solve(int idx,int prev,String s){
        
        if(idx>=s.length()){
            return 1;
        }
        if(dp[idx][prev]!=-1){
            return dp[idx][prev];
        }
        
        int curr=0;
        int ans=0;
        for(int i=idx;i<s.length();i++){
            curr+=s.charAt(i)-'0';
            if(curr>=prev){
                ans+=solve(i+1,curr,s);
            }
        }
        return dp[idx][prev]=ans;
    }
}
