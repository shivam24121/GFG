class Solution {
    public boolean wifiRange(String s, int x) {
        
        int n=s.length();
        
        int covered=-1;
        
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            
            if(c=='1'){
                if(i-x>covered+1){
                    return false;
                }
                covered=i+x;
            }
        }
        return covered>=n-1;
    }
}
