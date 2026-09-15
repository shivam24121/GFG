class Solution {
    public int getCount(Node root, int k) {
        ArrayList<Integer> leaves = new ArrayList<>();

        collect(root, 1, leaves);

        Collections.sort(leaves);

        int ans = 0;

        for (int cost : leaves) {
            if (cost > k) break;
            k -= cost;
            ans++;
        }

        return ans;
    }

    void collect(Node root, int level, ArrayList<Integer> leaves) {
        if (root == null) return;

        if (root.left == null && root.right == null) {
            leaves.add(level);
            return;
        }

        collect(root.left, level + 1, leaves);
        collect(root.right, level + 1, leaves);
    }
}
