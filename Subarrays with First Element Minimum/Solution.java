class Solution {
    public int countSubarrays(int[] arr) {
        Stack<Integer>st=new Stack<>();
        int n=arr.length;
        int res=0;
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[i]<=arr[st.peek()]){
                st.pop();
            }
            int rem=st.isEmpty()?n:st.peek();
            res+=(rem-i);
            st.push(i);
        }
        return res;
    }
}
