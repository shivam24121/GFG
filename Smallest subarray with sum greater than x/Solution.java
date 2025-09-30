class Solution {
    public static int smallestSubWithSum(int x, int[] arr) {
        int curr=0,res=Integer.MAX_VALUE;
        int l=0;
        for(int r=0;r<arr.length;r++){
            curr+=arr[r];
            
            while(curr>x){
                res=Math.min(res,r-l+1);
                curr-=arr[l];
                l++;
            }
        }
        return (res==Integer.MAX_VALUE)?0:res;
    }
}
