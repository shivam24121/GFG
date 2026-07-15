class Solution {
    public int bitonic(int[] arr) {
        
        int res=1;
        int n=arr.length;
        
        int[] prev=new int[n];
        int[] next=new int[n];
        
        Arrays.fill(prev,1);
        Arrays.fill(next,1);
        
        for(int i=1;i<n;i++){
            if(arr[i]>=arr[i-1]){
                prev[i]=prev[i-1]+1;
            }
        }
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=arr[i+1]){
                next[i]=next[i+1]+1;
            }
        }
        for(int i=0;i<n;i++){
            res=Math.max(res,prev[i]+next[i]-1);
        }
        return res;
    }
}
