class Solution {
    public ArrayList<Integer> search(int[] a, int[] b) {
        
        ArrayList<Integer>res=new ArrayList<>();
        
        int[] lps=build(b);
        
        int n=a.length;
        int m=b.length;
        
        int i=0;
        int j=0;
        
        while(i<n){
            if(a[i]==b[j]){
                i++;
                j++;
                if(j==m){
                    res.add(i-m);
                    j=lps[j-1];
                }
            }
            else{
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
    public int[] build(int[] a){
        
        int n=a.length;
        int[] lps=new int[n];
        
        int j=0;
        int i=1;
        
        while(i<n){
            if(a[i]==a[j]){
                j++;
                lps[i]=j;
                i++;
            }
            else{
                if(j!=0){
                    j=lps[j-1];
                }
                i++;
            }
        }
        return lps;
    }
}
