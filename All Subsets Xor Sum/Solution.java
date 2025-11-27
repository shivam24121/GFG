class Solution {
    int subsetXORSum(int arr[]) {
        int n = arr.length;
        int OR = 0;
        for (int i = 0; i < n; i++) {
            OR |= arr[i];
        }
        int subsets = 1 << (n - 1);
        return OR * subsets;
    }
}

