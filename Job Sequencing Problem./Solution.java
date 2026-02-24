class Solution {
    int[] parent;
    public void dsu(int n){
        parent=new int[n+1];
        for(int i=0;i<=n;i++){
            parent[i]=i;
        }
    }
    public int find(int u){
        if(u!=parent[u]){
            parent[u]=find(parent[u]);
        }
        return parent[u];
    }
    public void union(int u,int v){
        u=find(u);
        v=find(v);
        if(u==v)return;
        parent[u]=v;
    }
    public ArrayList<Integer> jobSequencing(int[] time, int[] profit) {
        ArrayList<Integer>res=new ArrayList<>();
        ArrayList<int[]>list=new ArrayList<>();
        int max=0;
        for(int i=0;i<time.length;i++){
            list.add(new int[]{time[i],profit[i]});
            max=Math.max(time[i],max);
        }
        dsu(max);
        Collections.sort(list,(a,b)->b[1]-a[1]);
        int sum=0;
        int ct=0;
        for(int[] e:list){
            int tm=e[0];
            int pr=e[1];
            
            int fd=find(tm);
            if(fd>0){
                sum+=pr;
                ct++;
                union(fd,fd-1);
            }
        }
        res.add(ct);
        res.add(sum);
        return res;
    }
}
