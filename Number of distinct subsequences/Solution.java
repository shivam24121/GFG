class Solution {
    int distinctSubseq(String s) {
        int n=s.length();
        int mod=(int)1e9+7;
        int[] dp=new int[n+1];
        dp[0]=1;
        
        Map<Character,Integer>map=new HashMap<>();
        for(int i=1;i<=n;i++){
            char c=s.charAt(i-1);
            dp[i]=(dp[i-1]*2)%mod;
            
            if(map.containsKey(c)){
                int j=map.get(c);
                dp[i]=(dp[i]-dp[j-1])%mod;
                if(dp[i] < 0) dp[i] += mod;
            }
            map.put(c,i);
        }
        return dp[n]%mod;
    }
}
