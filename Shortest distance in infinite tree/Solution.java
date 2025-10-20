class Solution {
    public int distance(int x, int y) {
        if(x==y)return 0;
        int dis=0;
        while(x!=y){
            if(x>y){
                x/=2;
                dis++;
            }
            else{
                y/=2;
                dis++;
            }
        }
        return dis;
    }
}
