class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        ArrayList<Integer> res=new ArrayList<>(arr.length);
        for(int i=0;i<arr.length;i++){
            res.add(-1);
        }
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
                int idx=st.pop();
                res.set(idx,arr[i]);
            }
            st.push(i);
        }
        return res;
    }
}
