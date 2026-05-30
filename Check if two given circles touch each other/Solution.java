
class Solution {
    int circleTouch(int x1, int y1, int r1, int x2, int y2, int r2) {
    
        double d=Math.sqrt((y2-y1)*(y2-y1)+(x2-x1)*(x2-x1));
        
        boolean fl=false;
            
        if(d<=r1+r2 && d>=Math.abs(r1-r2)){
            fl=true;
        }
        return (fl?1:0);
    }
}
