class Solution {
    public boolean isPattern(String s) {
        int i = 0, n = s.length();

        while (i < n) {
            int x = 0, y = 0;

            while (i < n && s.charAt(i) == 'x') {
                x++;
                i++;
            }

            while (i < n && s.charAt(i) == 'y') {
                y++;
                i++;
            }

            if (x == 0 || x != y) return false;
        }

        return true;
    }
}
