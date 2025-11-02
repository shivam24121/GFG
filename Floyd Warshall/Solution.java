class Solution {
    public void floydWarshall(int[][] dist) {
        int via=dist.length;
        int inf=(int)1e8;
        
        for(int k=0;k<via;k++){
            for(int i=0;i<via;i++){
                for(int j=0;j<via;j++){
                    if(dist[i][k]!=inf && dist[k][j]!=inf){
                        dist[i][j]=Math.min(dist[i][j],dist[i][k]+dist[k][j]);
                    }
                }
            }
        }
    }
}
