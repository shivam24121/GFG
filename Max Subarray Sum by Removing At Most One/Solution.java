class Solution {
    public int maxSumSubarray(int[] arr) {
        
        int ans=arr[0];
        int n=arr.length;
        int noDel=arr[0];
        int delOne=-(int)1e9;
        
        for(int i=1;i<n;i++){
            int newNoDel=Math.max(noDel+arr[i],arr[i]);
            int newDelOne=Math.max(noDel,delOne+arr[i]);
            ans=Math.max(ans,Math.max(newNoDel,newDelOne));
            noDel=newNoDel;
            delOne=newDelOne;
        }
        return ans;
    }
}
