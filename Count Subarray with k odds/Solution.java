class Solution {
    public int countSubarrays(int[] arr, int k) {
        return solve(arr,k)-solve(arr,k-1);
    }
    public int solve(int[] arr,int k){
        int l=0;
        int odd=0;
        int count=0;
        
        for(int r=0;r<arr.length;r++){
            if(arr[r]%2==1){
                odd++;
            }
            while(odd>k){
                if(arr[l]%2==1){
                    odd--;
                }
                l++;
            }
            count+=(r-l+1);
        }
        return count;
    }
}
