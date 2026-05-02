class Solution {
    public int findPosition(int n) {
        
        int a=Integer.numberOfLeadingZeros(n);
        int b=Integer.numberOfTrailingZeros(n);
        
        return 31-a==b?32-a:-1;
        
    }
}
