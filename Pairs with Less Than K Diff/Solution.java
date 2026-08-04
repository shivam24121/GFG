class Solution {
    int countPairs(int arr[], int k) {
        Arrays.sort(arr);

        int n = arr.length;
        int left = 0;
        long ans = 0;

        for (int right = 0; right < n; right++) {
            while (left < right && arr[right] - arr[left] >= k) {
                left++;
            }

            ans += right - left;
        }

        return (int) ans;
    }
}
