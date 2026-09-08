class Solution {
    
    int n;
    int m;
    
    int[] dx={-1,-1,-1,0,0,1,1,1};
    int[] dy={-1,0,1,-1,1,-1,0,1};
    
    String s;
    ArrayList<ArrayList<Integer>>res;
    
    public ArrayList<ArrayList<Integer>> searchWord(char[][] mat, String word) {
        
        s=word;
        n=mat.length;
        m=mat[0].length;
        
        res=new ArrayList<>();
        
        boolean[][] vis=new boolean[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                
                if(mat[i][j]==s.charAt(0)){
                    
                    for(int d=0;d<8;d++){
                        if(solve(i,j,0,vis,mat,d)){
                            res.add(new ArrayList<>(Arrays.asList(i,j)));
                            
                            for(boolean[] a:vis){
                                Arrays.fill(a,false);
                            }
                            break;
                        }
                    }
                }
            }
        }
        return res;
    }
    public boolean solve(int x,int y,int idx,boolean[][] vis,char[][] arr,int d){
        
        if(idx==s.length()){
            return true;
        }
        if(x<0 || x==n || y<0 || y==m || vis[x][y] || arr[x][y]!=s.charAt(idx)){
            return false;
        }
        vis[x][y]=true;
        
        for(int i=0;i<1;i++){
            
            int xx=x+dx[d];
            int yy=y+dy[d];
            
            if(solve(xx,yy,idx+1,vis,arr,d)){
                return true;
            }
        }
        vis[x][y]=false;
        return false;
    }
};
