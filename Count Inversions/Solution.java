class Solution {
    static int inversionCount(int arr[]) {
        int[] temp=new int[arr.length];
        return merge(arr,temp,0,arr.length-1);
    }
    static int merge(int[] arr,int[] temp,int l,int r){
        if(l>=r)return 0;
        
        int res=0;
        
        int mid=l+(r-l)/2;
        
        res+=merge(arr,temp,l,mid);
        res+=merge(arr,temp,mid+1,r);
        res+=ms(arr,temp,l,mid,r);
        
        return res;
    }
    static int ms(int[] arr,int[] temp,int l,int mid,int r){
        int i=l,j=mid+1;
        int k=l;
        int res=0;
        
        while(i<=mid && j<=r){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }
            else{
                temp[k++]=arr[j++];
                res+=mid-i+1;
            }
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=r){
            temp[k++]=arr[j++];
        }
        for(int x=l;x<=r;x++){
            arr[x]=temp[x];
        }
        return res;
    }
}
