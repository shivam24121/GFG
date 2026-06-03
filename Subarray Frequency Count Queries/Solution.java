class Solution {
    public ArrayList<Integer> freqInRange(int[] arr, int[][] queries) {
        
        int n=arr.length;
        
        Map<Integer,ArrayList<Integer>>map=new HashMap<>();
        
        for(int i=0;i<n;i++){
            map.putIfAbsent(arr[i],new ArrayList<>());
            map.get(arr[i]).add(i);
        }
        ArrayList<Integer>res=new ArrayList<>();
        
        for(int[] e:queries){
            
            int l=e[0];
            int r=e[1];
            int x=e[2];
            
            ArrayList<Integer>list=map.getOrDefault(x,new ArrayList<>());
            
            int left=lb(list,l);
            int right=up(list,r);
            
            if(left==-1){
                res.add(0);
                continue;
            }
            else{
                res.add(right-left+1);
            }
        }
        return res;
    }
    public int lb(ArrayList<Integer>list,int x){
        
        int l=0;
        int r=list.size()-1;
        
        int ans=-1;
        
        while(l<=r){
            int mid=l+(r-l)/2;
            if(list.get(mid)>=x){
                ans=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
    public int up(ArrayList<Integer>list,int x){
        
        int l=0;
        int r=list.size()-1;
        
        int ans=-1;
        
        while(l<=r){
            int mid=l+(r-l)/2;
            if(list.get(mid)<=x){
                ans=mid;
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return ans;
    }
}
