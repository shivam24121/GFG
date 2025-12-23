class Solution {
    public ArrayList<Integer> cntInRange(int[] arr, int[][] queries) {
        ArrayList<Integer>res=new ArrayList<>();
        int n=arr.length;
        Arrays.sort(arr);
        
        for(int[] e:queries){
            int l=e[0];
            int r=e[1];
            
            int x=first(arr,l);
            int y=last(arr,r);
            
            if(x==-1){
                res.add(0);
            }
            else if(x==y){
                res.add(1);
            }
            else{
                int temp=y-x+1;
                res.add(temp);
            }
        }
        return res;
    }
    public int first(int[] a,int x){
        int res=-1;
        int l=0,r=a.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(a[mid]>=x){
                res=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return res;
    }
    public int last(int[] a,int x){
        int res=-1;
        int l=0,r=a.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(a[mid]<=x){
                res=mid;
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return res;
    }
}
