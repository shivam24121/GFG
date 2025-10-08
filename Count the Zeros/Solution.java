class Solution {
    int countZeroes(int[] arr) {
        int ct=0;
        for(int i:arr){
            if(i==0){
                ct++;
            }
        }
        return ct;
    }
}
