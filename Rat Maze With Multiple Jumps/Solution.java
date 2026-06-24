class Solution {

    int[][] dp;
    int n;

    public ArrayList<ArrayList<Integer>> shortestDist(int[][] mat) {

        n = mat.length;
        dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        int[][] path = new int[n][n];

        if (mat[0][0] == 0 || !dfs(0, 0, mat, path)) {
            ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
            ArrayList<Integer> row = new ArrayList<>();
            row.add(-1);
            ans.add(row);
            return ans;
        }

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(path[i][j]);
            }
            ans.add(row);
        }

        return ans;
    }

    private boolean canReach(int r, int c, int[][] mat) {

        if (r >= n || c >= n || mat[r][c] == 0)
            return false;

        if (r == n - 1 && c == n - 1)
            return true;

        if (dp[r][c] != -1)
            return dp[r][c] == 1;

        int jump = mat[r][c];

        for (int k = 1; k <= jump; k++) {

            if (canReach(r, c + k, mat)
                    || canReach(r + k, c, mat)) {

                dp[r][c] = 1;
                return true;
            }
        }

        dp[r][c] = 0;
        return false;
    }

    private boolean dfs(int r, int c, int[][] mat, int[][] path) {

        if (r >= n || c >= n || mat[r][c] == 0)
            return false;

        if (!canReach(r, c, mat))
            return false;

        path[r][c] = 1;

        if (r == n - 1 && c == n - 1)
            return true;

        int jump = mat[r][c];

        for (int k = 1; k <= jump; k++) {

            if (canReach(r, c + k, mat)) {
                if (dfs(r, c + k, mat, path))
                    return true;
            }

            if (canReach(r + k, c, mat)) {
                if (dfs(r + k, c, mat, path))
                    return true;
            }
        }

        path[r][c] = 0;
        return false;
    }
}
