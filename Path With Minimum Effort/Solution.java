class Solution {
    
    static class Pair{
        int one;
        int two;
        int w;
        Pair(int x,int y,int w){
            this.one=x;
            this.two=y;
            this.w=w;
        }
    }
    static int[] dx={1,-1,0,0};
    static int[] dy={0,0,-1,1};
    
    public int minCostPath(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        
        int[][] dist=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dist[i],Integer.MAX_VALUE);
        }
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->a.w-b.w);
        pq.offer(new Pair(0,0,0));
        
        while(!pq.isEmpty()){
            Pair curr=pq.poll();
            int currNode=curr.one;
            int currNext=curr.two;
            int currDist=curr.w;
            
            if(dist[currNode][currNext]<currDist)continue;
            if(currNode==m-1 && currNext==n-1)return currDist;
            
            for(int i=0;i<4;i++){
                int xx=currNode+dx[i];
                int yy=currNext+dy[i];
                
                if(xx>=0 && xx<m &&  yy>=0 && yy<n){
                    int d=Math.abs(mat[currNode][currNext]-mat[xx][yy]);
                    int min=Math.max(currDist,d);
                    
                    if(min<dist[xx][yy]){
                        dist[xx][yy]=min;
                        pq.offer(new Pair(xx,yy,dist[xx][yy]));
                    }
                }
            }
        }
        return -1;
    }
}
