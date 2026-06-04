class Solution {
    int maxSubstring(String s) {
        
        int n=s.length();
        
        int curr=0;
        int max=0;
        
        for(int i=0;i<n;i++){
            int val=s.charAt(i)=='1'?-1:1;
            curr=Math.max(curr+val,val);
            max=Math.max(max,curr);
        }
        return max==0?-1:max;
    }
}
