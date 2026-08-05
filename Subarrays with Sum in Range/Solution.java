class Solution {

    long countAtMost(int[] arr, long k) {
        if (k < 0) return 0;

        int left = 0;
        long sum = 0, cnt = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum > k) {
                sum -= arr[left++];
            }

            cnt += right - left + 1;
        }

        return cnt;
    }

    public int countSubarray(int[] arr, int l, int r) {
        return (int)(countAtMost(arr, r) - countAtMost(arr, (long)l - 1));
    }
}
