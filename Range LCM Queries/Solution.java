class Solution {
    
    long[] segtree;
    
    public void intialize(int n){
        
        segtree=new long[n*4];
    }
    public void build(int idx,int l,int r,int[] arr){
        
        if(l==r){
            segtree[idx]=arr[l];
            return;
        }
        int mid=l+(r-l)/2;
        
        build(idx*2+1,l,mid,arr);
        build(idx*2+2,mid+1,r,arr);
        
        segtree[idx]=lcm(segtree[idx*2+1],segtree[idx*2+2]);
    }
    public void update(int idx,int l,int r,int updIdx,int val){
        
        if(l==r){
            segtree[idx]=val;
            return;
        }
        int mid=l+(r-l)/2;
        
        if(updIdx<=mid){
            update(idx*2+1,l,mid,updIdx,val);
        }
        else{
            update(idx*2+2,mid+1,r,updIdx,val);
        }
        segtree[idx]=lcm(segtree[idx*2+1],segtree[idx*2+2]);
    }
    public long query(int idx,int l,int r,int u,int v){
        
        if(l>v || r<u){
            return 1;
        }
        if(u<=l && r<=v){
            return segtree[idx];
        }
        int mid=l+(r-l)/2;
        
        long idhar=query(idx*2+1,l,mid,u,v);
        long udhar=query(idx*2+2,mid+1,r,u,v);
        
        return lcm(idhar,udhar);
    }
    public ArrayList<Long> RangeLCMQuery(int[] arr, int[][] queries) {
        
        ArrayList<Long>res=new ArrayList<>();
        
        int n=arr.length;
        
        intialize(n);
        build(0,0,n-1,arr);
        
        for(int[] e:queries){
            
            int type=e[0];
            
            if(type==1){
                
                int idx=e[1];
                int val=e[2];
                
                update(0,0,n-1,idx,val);
            }
            else if(type==2){
                
                int l=e[1];
                int r=e[2];
                
                long temp=query(0,0,n-1,l,r);
                res.add(temp);
            }
        }
        return res;
    }
    public long gcd(long a,long b){
        return b==0?a:gcd(b,a%b);
    }
    public long lcm(long a,long b){
        return (a/gcd(a,b))*b;
    }
}
