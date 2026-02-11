class Solution {
    
    long cost(int[] h, int[] c, long x) {
        long ans = 0;
        for (int i = 0; i < h.length; i++)
            ans += Math.abs(h[i] - x) * c[i];
        return ans;
    }
    
    public long minCost(int[] heights, int[] cost) {
        long lo = Integer.MAX_VALUE, hi = Integer.MIN_VALUE;
        
        for (int i = 0; i < heights.length; i++) {
            lo = Math.min(lo, heights[i]);
            hi = Math.max(hi, heights[i]);
        }
        
        long ans = Long.MAX_VALUE;
        
        while (lo <= hi) {
            long mid = (lo + hi) / 2;
            long c1 = cost(heights, cost, mid);
            long c2 = cost(heights, cost, mid + 1);
            
            ans = Math.min(c1, c2);
            
            if (c1 > c2)
                lo = mid + 1;
            else
                hi = mid - 1;
        }
        
        return ans;
    }
}
