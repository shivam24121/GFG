class Solution {
    public int kBitFlips(int[] arr, int k) {
        
        int n=arr.length;
        int flip=0;
        int res=0;
        
        for(int i=0;i<n;i++){
            
            if(i>=k && arr[i-k]==2)flip--;
            
            if((flip%2)==arr[i]){
                
                if(i+k>n)return -1;
                
                flip++;
                res++;
                arr[i]=2;          // anything other the 0 and 1;
            }
        }
        return res;
    }
}
