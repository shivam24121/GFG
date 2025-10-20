class Solution {
    public static int[] fibonacciNumbers(int n) {
        int[] a=new int[n];
        a[0]=0;
        if(n==1)return a;
        a[1]=1;
        if(n==2)return a;
        int prev2=0;
        int prev1=1;
        for(int i=2;i<n;i++){
            int curr=prev2+prev1;
            a[i]=curr;
            prev2=prev1;
            prev1=curr;
        }
        return a;
    }
}
