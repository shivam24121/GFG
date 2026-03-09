class Solution {
    public String largestSwap(String s) {
        int n=s.length();
        int max=0;
        int maxIdx=-1;
        int idx=-1;
        for(int i=n-1;i>=0;i--){
            int curr=s.charAt(i)-'0';
            if(curr>max){
                max=curr;
                maxIdx=i;
            }
            else if(curr<max){
                idx=i;
            }
        }
        if(idx==-1){
            return s;
        }
        StringBuilder sb=new StringBuilder(s);
        char temp=s.charAt(maxIdx);
        sb.setCharAt(maxIdx,s.charAt(idx));
        sb.setCharAt(idx,s.charAt(maxIdx));
        return sb.toString();
    }
}
