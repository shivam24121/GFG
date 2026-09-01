class Solution {
    public int palindromicStrings(int n, int k) {
        long mod = 1000000007, ans = 0, p = 1;

        for (int len = 1; len <= n; len++) {
            if (len % 2 == 1)
                p = p * (k - len / 2) % mod;

            ans = (ans + p) % mod;
        }

        return (int) ans;
    }
}
