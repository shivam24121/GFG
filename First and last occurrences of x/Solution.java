class Solution {
    public ArrayList<Integer> firstAndLast(int x, int arr[]) {
        ArrayList<Integer>ans=new ArrayList<>();
        int first=low(arr,x);
        if(first==-1){
            ans.add(-1);
        }
        else{
            ans.add(low(arr,x));
            ans.add(high(arr,x));
        }
        return ans;
    }
    public static int low(int[] a,int x){
        int l=0,r=a.length-1;
        int res=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(a[mid]==x){
                res=mid;
                r=mid-1;
            }
            else if(a[mid]<x){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return res;
    }
    public static int high(int[] a,int x){
        int l=0,r=a.length-1;
        int res=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(a[mid]==x){
                res=mid;
                l=mid+1;
            }
            else if(a[mid]<x){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return res;
    }
}
