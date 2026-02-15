class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
       int n=arr.size();
       Collections.sort(arr);
       int res=Integer.MAX_VALUE;
       
       for(int i=m-1;i<n;i++){
           res=Math.min(res,arr.get(i)-arr.get(i-m+1));
       }
       return res;
    }
}
