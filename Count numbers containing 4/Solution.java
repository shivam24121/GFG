
class Solution {
    public static int countNumberswith4(int n) {
        int ct=0;
        for(int i=1;i<=n;i++){
            String s=String.valueOf(i);
            if(s.indexOf('4')>=0)ct++;
        }
        return ct;
    }
}
