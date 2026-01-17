class Solution {
    public static boolean checkRedundancy(String s) {
        int n=s.length();
        Stack<Character>st=new Stack<>();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c!=')'){
                st.push(c);
            }
            else{
                boolean fl=false;
                while(!st.isEmpty() && st.peek()!='('){
                    char top=st.pop();
                    if(top=='+' || top=='-'|| top=='*'|| top=='/'){
                        fl=true;
                    }
                }
                st.pop();
                if(!fl)return true;
            }
        }
        return false;
    }
}
