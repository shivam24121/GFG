import java.util.*;
class Solution {
    static class P{int v; long w; P(int a,long b){v=a;w=b;}}
    long[] dijkstra(int n, ArrayList<ArrayList<P>> g, int src){
        long[] d=new long[n]; Arrays.fill(d,Long.MAX_VALUE);
        PriorityQueue<P> pq=new PriorityQueue<>((a,b)->Long.compare(a.w,b.w));
        d[src]=0; pq.add(new P(src,0));
        while(!pq.isEmpty()){
            P x=pq.poll(); if(x.w!=d[x.v]) continue;
            for(P e:g.get(x.v)){
                if(d[e.v]>x.w+e.w){
                    d[e.v]=x.w+e.w; pq.add(new P(e.v,d[e.v]));
                }
            }
        }
        return d;
    }
    int shortestPath(int V,int E,int a,int b,int[][] edges){
        ArrayList<ArrayList<P>> g=new ArrayList<>();
        for(int i=0;i<V;i++) g.add(new ArrayList<>());
        for(int[] e:edges){
            g.get(e[0]).add(new P(e[1],e[2]));
            g.get(e[1]).add(new P(e[0],e[2]));
        }
        long[] da=dijkstra(V,g,a), db=dijkstra(V,g,b);
        long ans=da[b];
        for(int[] e:edges){
            int u=e[0],v=e[1]; long w=e[3];
            if(da[u]!=Long.MAX_VALUE && db[v]!=Long.MAX_VALUE)
                ans=Math.min(ans,da[u]+w+db[v]);
            if(da[v]!=Long.MAX_VALUE && db[u]!=Long.MAX_VALUE)
                ans=Math.min(ans,da[v]+w+db[u]);
        }
        return ans==Long.MAX_VALUE?-1:(int)ans;
    }
}
