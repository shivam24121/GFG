class Solution {
    public int cntWays(int[] arr) {
        int n=arr.length;
         
        long oddSum=0,evenSum=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                evenSum+=arr[i];
            }
            else{
                oddSum+=arr[i];
            }
        }
        int res=0;
        long currOdd=0,currEven=0;
        
        for(int i=0;i<n;i++){
            long afterOdd=oddSum-currOdd;
            long afterEven=evenSum-currEven;
            
            if(i%2==1){
                afterOdd-=arr[i];
            }
            else{
                afterEven-=arr[i];
            }
            if((currOdd+afterEven)==(currEven+afterOdd)){
                res++;
            }
            if(i%2==0){
                currEven+=arr[i];
            }
            else{
                currOdd+=arr[i];
            }
        }
        return res;
    }
}
