class Solution {
    public boolean isPower(int x, int y) {
        if(x==1)return y==1;
        Double res=Math.log(y)/Math.log(x);
        return Math.abs(res-Math.round(res))<1e-10;
    }
}
