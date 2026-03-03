class Solution {
    ArrayList<Integer> search(String pat, String txt) {
        
        ArrayList<Integer>res=new ArrayList<>();
        
        int n=txt.length();
        int m=pat.length();
        
        int[] lps=computeLPS(pat);
        
        int i=0,j=0;
        
        while(i<n){
            if(txt.charAt(i)==pat.charAt(j)){
                i++;
                j++;
            }
            if(j==m){
                res.add(i-m);
                j=lps[j-1];
            }
            else if(i<n && txt.charAt(i)!=pat.charAt(j)){
                if(j!=0){
                    j=lps[j-1];
                }
                else{
                    i++;
                }
            }
        }
        return res;
    }
    public int[] computeLPS(String s){
        int[] lps=new int[s.length()];
        int i=1;
        lps[0]=0;
        int len=0;
        while(i<s.length()){
            if(s.charAt(i)==s.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else{
                if(len!=0){
                    len=lps[len-1];
                }
                else{
                    lps[len]=0;
                    i++;
                }
            }
        }
        return lps;
    }
}
