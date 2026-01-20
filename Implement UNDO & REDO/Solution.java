class Solution {
    
    StringBuilder sb=new StringBuilder();
    Stack<Character>st=new Stack<>();
    public void append(char x) {
        sb.append(x);
    }

    public void undo() {
        if(sb.length()==0)return;
        st.push(sb.charAt(sb.length()-1));
        sb.deleteCharAt(sb.length()-1);
    }

    public void redo() {
        if(st.isEmpty()){
            return;
        }
        sb.append(st.pop());
    }

    public String read() {
        return sb.toString();
    }
}
