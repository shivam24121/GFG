class Solution {
    
    static class Pair{
        int one;
        int two;
        Pair(int x,int y){
            this.one=x;
            this.two=y;
        }
    }
    int m;
    int n;
    
    static int[] dx={1,-1,0,0};
    static int[] dy={0,0,1,-1};
    
    public ArrayList<ArrayList<Integer>> nearest(int[][] grid) {
        m=grid.length;
        n=grid[0].length;
        
        Queue<Pair>q=new LinkedList<>();
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
    
        for(int i=0;i<m;i++){
            ArrayList<Integer>temp=new ArrayList<>(Collections.nCopies(n,-1));
            res.add(temp);
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    res.get(i).set(j,0);
                    q.add(new Pair(i,j));
                }
    
            }
        }
        while(!q.isEmpty()){
            Pair curr=q.poll();
            int x=curr.one;
            int y=curr.two;
            
            for(int i=0;i<4;i++){
                int xx=x+dx[i];
                int yy=y+dy[i];
                
                if(xx>=0 && xx<m && yy>=0 && yy<n && res.get(xx).get(yy)==-1){
                    res.get(xx).set(yy,res.get(x).get(y)+1);
                    q.add(new Pair(xx,yy));
                }
            }
        }
        
        return res;
    }
}
