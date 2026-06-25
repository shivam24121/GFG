class Solution {
    
    static ArrayList<Integer>res;
    
    public static ArrayList<Integer> increasingNumbers(int n) {
        
        res=new ArrayList<>();
        if(n==1){
            res.add(0);
        }
        solve(0,0,n);
        
        return res;
    }
    public static void solve(int num,int idx,int n){
        if(idx==n){
            res.add(num);
            return;
        }
        int prev=num%10;
        
        for(int i=prev+1;i<=9;i++){
            int nextNum=num*10+i;
            solve(nextNum,idx+1,n);
        }
    }
}
