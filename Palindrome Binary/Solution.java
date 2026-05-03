class Solution {
    static long isPallindrome(long n) {
        
        String s=Long.toBinaryString(n);
        int len=s.length();
        
        for(int i=0;i<len/2;i++){
            if(s.charAt(i)!=s.charAt(len-i-1)){
                return 0L;
            }
        }
        return 1L;
    }
}
