class Solution {

    static final int MOD = 1000000007;
    long[][] dp;
    int n;

    long solve(int ones, int zeros) {

        // All characters used
        if (ones == n && zeros == n) {
            return 1;
        }

        if (dp[ones][zeros] != -1) {
            return dp[ones][zeros];
        }

        long ans = 0;

        // Add 1
        if (ones < n) {
            ans = (ans + solve(ones + 1, zeros)) % MOD;
        }

        // Add 0
        if (zeros < n && zeros < ones) {
            ans = (ans + solve(ones, zeros + 1)) % MOD;
        }

        return dp[ones][zeros] = ans;
    }

    public int prefixStrings(int N) {
        n = N;

        dp = new long[n + 1][n + 1];

        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return (int) solve(0, 0);
    }
}
