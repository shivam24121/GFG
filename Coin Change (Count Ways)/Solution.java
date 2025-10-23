class Solution {
    public int count(int coins[], int sum) {
        int[] t=new int[sum+1];
        t[0]=1;
        
        for(int i:coins){
            for(int j=i;j<=sum;j++){
                t[j]+=t[j-i];
            }
        }
        return t[sum];
    }
}
