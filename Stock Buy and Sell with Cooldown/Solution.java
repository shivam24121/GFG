class Solution {
    
    int[][] t;
    public int maxProfit(int arr[]) {
        int n=arr.length;
        if(n==1)return 0;
        
        t=new int[n+1][2];
        for(int i=0;i<=n;i++){
            Arrays.fill(t[i],-1);
        }
        return solve(0,arr,0);
    }
    public int solve(int idx,int[] a,int fl){
        if(idx>=a.length)return 0;
        
        if(t[idx][fl]!=-1)return t[idx][fl];
        
        if(fl==1){
            int op2=a[idx]+solve(idx+2,a,0);
            int op3=solve(idx+1,a,1);
            return t[idx][fl]=Math.max(op2,op3);
        }
        else{
            int op1=-a[idx]+solve(idx+1,a,1);
            int op3=solve(idx+1,a,0);
            return t[idx][fl]=Math.max(op1,op3);
        }
    }
}
