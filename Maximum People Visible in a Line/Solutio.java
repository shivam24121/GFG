class Solution {
    public int maxPeople(int[] arr) {
        
        int[] left=NGL(arr);
        int[] right=NGR(arr);
        
        int res=-1;
        
        for(int i=0;i<arr.length;i++){
            res=Math.max(res,left[i]+right[i]-1);
        }
        return res;
    }
    public int[] NGL(int[] arr){
        int n=arr.length;
        int[] res=new int[n];
        Stack<Integer>st=new Stack<>();
        
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
                st.pop();
            }
            res[i]=st.isEmpty()?i+1:i-st.peek();
            st.push(i);
        }
        return res;
    }
    public int[] NGR(int[] arr){
        int n=arr.length;
        int[] res=new int[n];
        Stack<Integer>st=new Stack<>();
        
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
                st.pop();
            }
            res[i]=st.isEmpty()?n-i:st.peek()-i;
            st.push(i);
        }
        return res;
    }
}
