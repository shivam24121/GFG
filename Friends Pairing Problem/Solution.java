class Solution {
    public long countFriendsPairings(int n) {
        if (n <= 2) return n;

        long a = 1;
        long b = 2;

        for (int i = 3; i <= n; i++) {
            long c = b + (i - 1) * a;
            a = b;
            b = c;
        }

        return b;
    }
}
