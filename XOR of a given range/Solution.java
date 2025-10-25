class Solution {
    public int getXor(int[] nums, int a, int b) {
        int res=0;
        for(int i=a;i<=b;i++){
            res^=nums[i];
        }
        return res;
    }
}
