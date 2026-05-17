class Solution {
    List<Integer> makeBeautiful(int[] arr) {
        
        // List<Integer>res=new ArrayList<>();
        Stack<Integer>st=new Stack<>();
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            if(!st.isEmpty() && inValid(arr[i],st.peek())){
                st.pop();
            }
            else{
                st.push(arr[i]);
            }
        }
        return new ArrayList<Integer>(st);
    }
    public boolean inValid(int a,int b){
        boolean one=a>=0;
        boolean two=b>=0;
        
        return (one^two)==true;
    }
}
