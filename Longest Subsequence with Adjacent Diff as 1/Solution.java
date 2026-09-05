class Solution {
    public int longestSubseq(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;

        for (int x : arr) {
            int len = Math.max(map.getOrDefault(x - 1, 0),
                               map.getOrDefault(x + 1, 0)) + 1;

            map.put(x, len);
            ans = Math.max(ans, len);
        }

        return ans;
    }
}
