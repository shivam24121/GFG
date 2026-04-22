class Solution {
    public ArrayList<Integer> findMean(int[] arr, int[][] queries) {
       
        int n=arr.length;
        ArrayList<Integer>res=new ArrayList<>();
        
        int[] prefix=new int[n];
        
        prefix[0]=arr[0];
        
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int[] e:queries){
            int l=e[0];
            int r=e[1];
            
            // System.out.println(l-1+" "+r);
            
            int len=r-l+1;
            
            int ans=(prefix[r]-((l-1)>=0?prefix[l-1]:0))/len;
            
            res.add(ans);
        }
        return res;
    }
}
