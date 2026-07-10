class Solution {
    public int getCount(int n) {
        
        int count=0;
        
        for(int k=2;2*n>(k*(k-1));k++){
            
            int num=n-(k*(k-1)/2);
            
            if(num%k==0){
                count++;
            }
        }
        return count;
    }
};
