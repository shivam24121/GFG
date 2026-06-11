class Solution {
    public int findIndex(String s) {
        
        int n=s.length();
        
        int[] suffix=new int[n];
        suffix[n-1]=s.charAt(n-1)==')'?1:0;
        
        for(int i=n-2;i>=0;i--){
            suffix[i]=suffix[i+1];
            if(s.charAt(i)==')'){
                suffix[i]++;
            }
        }
        int ct=0;
        
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                ct++;
            }
            if(ct==(i+1<n?suffix[i+1]:0)){
                return i+1;
            }
        }
        return 0;
    }
}
