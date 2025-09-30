class Solution {
    public ArrayList<String> binstr(int n) {
        ArrayList<String>res=new ArrayList<>();
        int range=pow(2,n)-1;
        
        for(int i=0;i<=range;i++){
            String temp=Integer.toBinaryString(i);
            String padded=String.format("%"+n+"s",temp).replace(' ','0');
            res.add(padded);
        }
        return res;
    }
    public int pow(int b,int p){
        int res=1;
        while(p>0){
            if((p&1)==1){
                res=res*b;
            }
            b*=b;
            p/=2;
        }
        return res;
    }
}
