class Solution {
    public boolean isBalanced(String s) {
        Stack<Character>st=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='(' || c=='{' || c=='['){
                st.push(c);
            }
            else{
                if(st.isEmpty())return false;
                char top=st.peek();
                if(top=='(' && c!=')' 
                 ||top=='{' && c!='}' 
                 ||top=='[' && c!=']'){
                     return false;
                }
                st.pop();
            }
        }
        return st.isEmpty();
    }
}
