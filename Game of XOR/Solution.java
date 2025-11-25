class Solution {
    public int subarrayXor(int[] arr) {
        int res=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            long temp=(long)(i+1)*(n-i);
            if(temp%2==1){
                res^=arr[i];
            }
        }
        return res;
    }
}
