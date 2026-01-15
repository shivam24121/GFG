class Solution {
    public int minCandy(int arr[]) {
        int n=arr.length;
        int[] res=new int[n];
        Arrays.fill(res,1);
        
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                res[i]=res[i-1]+1;
            }
        }
        for(int i=n-1;i>=1;i--){
            if(arr[i]<arr[i-1]){
                res[i-1]=Math.max(res[i-1],res[i]+1);
            }
        }
        // for(int i=0;i<n;i++){
        //     System.out.print(res[i]+" ");
        // }
        
        int ct=Arrays.stream(res).sum();
        return ct;
    }
}
