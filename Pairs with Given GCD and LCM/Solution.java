class Solution {
    public int pairCount(int x, int y) {
        
        int res=0;
        
        long product=x*y;
        
        for(int i=1;i*i<=product;i++){
            
            if(product%i==0){
                
                int a=i;
                int b=(int)product/a;
                
                if(lcm(a,b)==y && gcd(a,b)==x){
                    res++;
                    if(a!=b){
                        res++;
                    }
                }
            }
        }
        return res;
    }
    public int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }
    public int lcm(int a,int b){
        return (a/gcd(a,b))*b;
    }
}
