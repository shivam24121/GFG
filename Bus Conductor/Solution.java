class Solution {
    public int findMoves(int[] c, int[] p) {
        int n=c.length;
        int res=0;
        Arrays.sort(c);
        Arrays.sort(p);
        
        for(int i=0;i<n;i++){
            int diff=Math.abs(c[i]-p[i]);
            res+=diff;
        }
        return res;
    }
}
