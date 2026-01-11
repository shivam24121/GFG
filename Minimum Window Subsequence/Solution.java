class Solution {
    public String minWindow(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        int i=0,j=0,k=0;
        String res="";
        int size=Integer.MAX_VALUE;
        
        while(j<n){
            if(s1.charAt(j)==s2.charAt(k)){
                k++;
            }
            if(k==m){
                i=j;
                k=m-1;
                while(i>=0 && k>=0){
                    if(s1.charAt(i)==s2.charAt(k)){
                        k--;
                    }
                    i--;
                }
                i++;
                if(size>j-i+1){
                    size=j-i+1;
                    res=s1.substring(i,j+1);
                }
                k=0;
                j=i+1;
            }
            j++;
        }
        return res;
    }
}
