class Solution {
    public int sumSubMins(int[] arr) {
        int n=arr.length;
        int res=0;
        int[] nsl=NSL(arr);
        int[] nsr=NSR(arr);
        
        for(int i=0;i<n;i++){
            int temp=nsl[i]*nsr[i]*arr[i];
            res+=temp;
        }
        
        return res;
    }
    public int[] NSL(int[] arr){
        int n=arr.length;
        int[] res=new int[n];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[i]<=arr[st.peek()]){
                st.pop();
            }
            int idx=st.isEmpty()?-1:st.peek();
            res[i]=i-idx;
            st.push(i);
        }
        return res;
    }
    public int[] NSR(int[] arr){
        int n=arr.length;
        int[] res=new int[n];
        Stack<Integer>st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
                st.pop();
            }
            int idx=st.isEmpty()?n:st.peek();
            res[i]=idx-i;
            st.push(i);
        }
        return res;
    }
}


/*
        3 1 2 4 
        0 1 0 0
        0 2 1 0
        3+6+4+4=
    
    
       4 2 1 7 8 4 2
       0 1 2 0 0 2 3
       0 0 4 1 0 0 0
       1 2 15 2 1 3 4
       
       4+4+15+14+8+12+8
       4+4+15+14+8+12+8
    
*/
