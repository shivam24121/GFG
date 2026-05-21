class Solution {
    public boolean isBitSet(int n) {
        return n>0 && ((n+1)&n)==0;
    }
};
