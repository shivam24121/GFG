class Solution {
    public boolean canServe(int[] arr) {
        int ct5=0,ct10=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==5){
                ct5++;
            }
            else if(arr[i]==10){
                if(ct5<1){
                    return false;
                }
                ct5--;
                ct10++;
            }
            else{
                if(ct10>0 && ct5>0){
                    ct10--;
                    ct5--;
                }
                else if(ct5>=3){
                    ct5-=3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}
