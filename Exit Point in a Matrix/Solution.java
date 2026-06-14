class Solution {
    
    int[] dx={0,1,0,-1};
    int[] dy={1,0,-1,0};
    
    public List<Integer> exitPoint(int[][] mat) {
        
        int dir=0;
        
        List<Integer>list=new ArrayList<>();
        
        int n=mat.length;
        int m=mat[0].length;
        
        int lastX=0;
        int lastY=0;
        
        int x=0;
        int y=0;
        
        while(x>=0 && x<n && y>=0 && y<m){
            
            lastX=x;
            lastY=y;
            
            if(mat[x][y]==0){
                x+=dx[dir];
                y+=dy[dir];
            }
            else{
                dir++;
                dir%=4;
                mat[x][y]=0;
                x+=dx[dir];
                y+=dy[dir];
            }
            
            // System.out.println(lastX+" "+lastY);
        }
        
        list.add(lastX);
        list.add(lastY);
        
        return list;
    }
}
