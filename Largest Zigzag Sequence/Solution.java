class Solution {
    public int zigzagSequence(int[][] mat) {

        int n = mat.length;
        int[][] dp = new int[n][n];

        for (int j = 0; j < n; j++)
            dp[0][j] = mat[0][j];

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int best = 0;

                for (int k = 0; k < n; k++) {
                    if (k != j)
                        best = Math.max(best, dp[i - 1][k]);
                }

                dp[i][j] = mat[i][j] + best;
            }
        }

        int ans = 0;

        for (int j = 0; j < n; j++)
            ans = Math.max(ans, dp[n - 1][j]);

        return ans;
    }
}
