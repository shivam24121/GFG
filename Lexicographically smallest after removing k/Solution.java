class Solution {
    public String lexicographicallySmallest(String s, int k) {
        
        int n=s.length();
        if((n&(n-1))==0){
            k/=2;
        }
        else{
            k*=2;
        }
        if(k>=n){
            return String.valueOf(-1);
        }
        Stack<Character>st=new Stack<>();
        
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && s.charAt(i)<st.peek() && k>0){
                st.pop();
                k--;
            }
            st.push(s.charAt(i));
        }
        while(!st.isEmpty() && k>0){
            st.pop();
            k--;
        }
        if(k!=0 && st.isEmpty()){
            return new String("-1");
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}
