class Solution {
    int maxProduct(int[] arr) {
        int min=arr[0],max=arr[0],res=arr[0];
        
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            
            if(curr<0){
                min=max+min-(max=min);
            }
            
            min=Math.min(curr,curr*min);
            max=Math.max(curr,curr*max);
            
            res=Math.max(res,Math.max(min,max));
        }
        return res;
    }
}
