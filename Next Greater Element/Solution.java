class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        Stack<Integer>st=new Stack<>();
        ArrayList<Integer>res=new ArrayList<>();
        for(int i:arr){
            res.add(-1);
        }
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
                int idx=st.pop();
                res.set(idx,arr[i]);
            }
            st.push(i);
        }
        return res;
    }
}
