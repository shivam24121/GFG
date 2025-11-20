class Solution {
    public int minCost(String s, String t, char[][] transform, int[] cost) {
        int[][] dist=new int[26][26];
        int inf=(int)1e9+7;
        for(int i=0;i<26;i++){
            for(int j=0;j<26;j++){
                if(i==j)continue;
                else{
                    dist[i][j]=inf;
                }
            }
        }
        for(int i=0;i<cost.length;i++){
            int one=transform[i][0]-'a';
            int two=transform[i][1]-'a';
            dist[one][two]=Math.min(dist[one][two],cost[i]);
        }
        for(int via=0;via<26;via++){
            for(int i=0;i<26;i++){
                for(int j=0;j<26;j++){
                    if(dist[i][via]!=inf && dist[via][j]!=inf){
                        dist[i][j]=Math.min(dist[i][j],dist[i][via]+dist[via][j]);
                    }
                }
            }
        }
        int res=0;
        for(int i=0;i<s.length();i++){
            int one=s.charAt(i)-'a';
            int two=t.charAt(i)-'a';
            int best=inf;
            
            for(int c=0;c<26;c++){
                best=Math.min(best,dist[one][c]+dist[two][c]);
            }
            if(best==inf)return -1;
            else{
                res+=best;
            }
        }
        return res;
    }
}
