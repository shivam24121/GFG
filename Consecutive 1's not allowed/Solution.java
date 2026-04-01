class Solution {
    int countStrings(int n) {
        
        int[] arr=new int[n+2];
        
        if(n==1)return 2;
        
        int prev1=1;
        int prev2=1;
        
        int res=0;
        
        for(int i=2;i<=n+1;i++){
            res=prev1+prev2;
            prev2=prev1;
            prev1=res;
        }
        return res;
    }
}


/*

    0 1
    00 01 10
    000 001 010 100 101
    0000 0001 0010 0100 0101 1000 1001 1010
    00000 00001 00010 00100 00101 01000 01001 01010 10000 10001 10010 10100 10101


    1 2 3 5 8 13
    0 1 2 3 4 5
*/
