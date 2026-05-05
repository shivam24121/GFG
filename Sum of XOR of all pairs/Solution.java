class Solution {
    public long sumXOR(int[] arr) {
        
        long res=0;
        int n=arr.length;
        
        for(int x=0;x<31;x++){
            
            int ct1=0;
            int ct0=0;
            
            for(int i=0;i<n;i++){
                if((arr[i]&(1<<x))!=0){
                    ct1++;
                }
            }
            ct0=n-ct1;
            res+=(1L<<x)*ct0*ct1;
        }
        return res;
    }
}
