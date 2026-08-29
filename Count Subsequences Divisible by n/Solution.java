class Solution {
    static final int MOD = 1000000007;
    String s;
    int n;
    Long[][] dp;

    public int countSubsequences(String s, int n) {
        this.s = s;
        this.n = n;
        dp = new Long[s.length()][n];

        long ans = dfs(0, 0, false);
        return (int) ans;
    }

    long dfs(int i, int rem, boolean taken) {
        if (i == s.length())
            return taken && rem == 0 ? 1 : 0;

        if (taken && dp[i][rem] != null)
            return dp[i][rem];

        long ans = dfs(i + 1, rem, taken);

        int d = s.charAt(i) - '0';
        int nr = (rem * 10 + d) % n;

        ans = (ans + dfs(i + 1, nr, true)) % MOD;

        if (taken)
            dp[i][rem] = ans;

        return ans;
    }
}
