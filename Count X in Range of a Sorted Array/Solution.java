class Solution {
    public ArrayList<Integer> countXInRange(int[] arr, int[][] queries) {
        ArrayList<Integer>res=new ArrayList<>();
        
        for(int[] e:queries){
            int l=e[0];
            int r=e[1];
            int x=e[2];
            
            int temp=solve(arr,l,r,x);
            res.add(temp);
        }
        return res;
    }
    public int last(int[] arr,int l,int r,int x){
        int res=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==x){
                res=mid;
                l=mid+1;
            }
            else if(arr[mid]<x){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return res;
    }
    public int first(int[] arr,int l,int r,int x){
        int res=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==x){
                res=mid;
                r=mid-1;
            }
            else if(arr[mid]<x){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return res;
    }
    public int solve(int[] arr,int l,int r,int x){
        int high=last(arr,l,r,x);
        int low=first(arr,l,r,x);
        if(low==-1)return 0;
        return high-low+1;
    }
}
