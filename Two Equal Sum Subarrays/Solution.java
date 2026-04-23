class Solution {
    public boolean canSplit(int arr[]) {
        
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        if(sum%2==1)return false;
        
        int temp=0;
        for(int i:arr){
            temp+=i;
            if(temp==sum/2){
                return true;
            }
        }
        return false;
    }
}
