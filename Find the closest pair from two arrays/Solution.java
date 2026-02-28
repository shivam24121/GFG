class Solution {
    public static ArrayList<Integer> findClosestPair(int arr1[], int arr2[], int x) {
        ArrayList<Integer>res=new ArrayList<>();
        int off=Integer.MAX_VALUE;
        int a=-1,b=-1;
        
        int n=arr1.length;
        int m=arr2.length;
        
        int i=0;
        int j=m-1;
        
        while(i<n && j>=0){
            int sum=arr1[i]+arr2[j];
            int diff=Math.abs(x-sum);
                if(diff<off){
                    off=diff;
                    a=arr1[i];
                    b=arr2[j];
                }
                if(sum>x){
                    j--;
                }
                else{
                    i++;
                }
        }
        res.add(a);
        res.add(b);
        return res;
    }
}
