class Solution {
    public int minSwaps(int[] arr) {
        
        int n=arr.length;
        int one=0;
        for(int i:arr){
            if(i==1){
                one++;
            }
        }
        if(one==0)return -1;
        int ct=0;
        for(int i=0;i<one;i++){
            if(arr[i]==1){
                ct++;
            }
        }
        int res=one-ct;
        
        for(int i=one;i<n;i++){
            if(arr[i]==1){
                ct++;
            }
            if(arr[i-one]==1){
                ct--;
            }
            res=Math.min(res,one-ct);
        }
        return res;
    }
}
