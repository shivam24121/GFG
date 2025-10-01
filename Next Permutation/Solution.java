class Solution {
    void nextPermutation(int[] arr) {
        int n=arr.length;
        int gola=-1,bada=-1;
        for(int i=n-1;i>0;i--){
            if(arr[i]>arr[i-1]){
                gola=i-1;
                break;
            }
        }
        if(gola!=-1){
            for(int i=n-1;i>=gola+1;i--){
                if(arr[i]>arr[gola]){
                    bada=i;
                    break;
                }
            }
            swap(arr,gola,bada);
        }
        reverse(arr,gola+1,n-1);
    }
    public void swap(int[] a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public void reverse(int[] a,int i,int j){
        while(i<j){
            swap(a,i,j);
            i++;
            j--;
        }
    }
}
