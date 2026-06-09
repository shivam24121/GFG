class Solution {
    public boolean canSeatAllPeople(int k, int[] arr) {
        
        int prev=-2;
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            if(i==n-1){
                if(prev!=n-2 && arr[i]==0){
                    k--;
                    prev=i;
                    // System.out.println(i);
                }
            }
            else{
                if(prev!=i-1 && arr[i+1]!=1 && arr[i]==0){
                    k--;
                    prev=i;
                    //   System.out.println(i);
                }
            }
            if(arr[i]==1){
                prev=i;
            }
        }
        return k<=0;
    }
}
