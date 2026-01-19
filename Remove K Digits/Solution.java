class Solution {
    public String removeKdig(String s, int k) {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        Deque<Integer>dq=new ArrayDeque<>();
        
        for(int i=0;i<n;i++){
            int curr=s.charAt(i)-'0';
            while(!dq.isEmpty() && curr<dq.peekLast() && k>0){
                dq.pollLast();
                k--;
            }
            dq.offerLast(curr);
        }
        while(k>0 && !dq.isEmpty()){
            dq.pollLast();
            k--;
        }
        while(!dq.isEmpty()){
            sb.append(dq.pollFirst());
        }
        while(sb.length()>1 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        return sb.length()==0?"0":sb.toString();
    }
}
