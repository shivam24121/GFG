class Solution {
    public ArrayList<Integer> nextFreqGreater(int[] arr) {
        int n=arr.length;
        Map<Integer,Integer>map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        ArrayList<Integer>res=new ArrayList<>(Collections.nCopies(n,0));
        Stack<Integer>st=new Stack<>();
        
        for(int i=n-1;i>=0;i--){
            int x=arr[i];
            while(!st.isEmpty() && map.get(x)>=map.get(st.peek())){
                st.pop();
            }
            if(st.isEmpty()){
                res.set(i,-1);
            }
            else{
                res.set(i,st.peek());
            }
            st.push(x);
        }
        return res;
    }
}
