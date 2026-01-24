class Solution {
    int findWays(int n) {
        
        if(n%2==1)return 0;
        
        int[] catalan={1, 1, 2, 5, 14, 42, 132, 429, 1430, 4862,16796};
        int ans=catalan[n/2];
        return ans;
    }
}
