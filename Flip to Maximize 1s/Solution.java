class Solution {
    int maxOnes(int[] arr) {
        
        int n=arr.length;
        
        int one=0;
        
        for(int i:arr){
            if(i==1)
            one++;
        }
        
        int[] temp=new int[n];
        
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                temp[i]=-1;
            }
            else{
                temp[i]=1;
            }
        }
        
        // for(int i=0;i<n;i++){
        //     System.out.print(temp[i]+" ");
        // }
        
        int curr=temp[0];
        int max=temp[0];
        
        for(int i=1;i<n;i++){
            curr=Math.max(temp[i],curr+temp[i]);
            max=Math.max(curr,max);
        }
        return one+Math.max(max,0);
    }
};
