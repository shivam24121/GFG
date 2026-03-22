class Solution {
    
    static int[] dx={1,0,0,-1};
    static int[] dy={0,1,-1,0};
    int n,m;
    
    public int orangesRot(int[][] mat) {
        n=mat.length;
        m=mat[0].length;
        
        int fresh=0;
        int time=0;
        Queue<int[]>q=new ArrayDeque<>();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    fresh++;
                }
                else if(mat[i][j]==2){
                    q.offer(new int[]{i,j});
                }
            }
        }
        if(fresh==0)return time;
        if(q.size()==0)return -1;
        
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                int[] curr=q.poll();
                for(int j=0;j<4;j++){
                    int xx=curr[0]+dx[j];
                    int yy=curr[1]+dy[j];
                    if(xx>=0 && xx<n && yy>=0 && yy<m && mat[xx][yy]==1){
                        fresh--;
                        mat[xx][yy]=2;
                        q.offer(new int[]{xx,yy});
                    }
                }
            }
            time++;
        }
        return fresh==0?time-1:-1;
    }
}
