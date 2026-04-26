class Solution {
    public ArrayList<Integer> commonElements(int[] a, int[] b, int[] c) {
        
        int n=a.length;
        int m=b.length;
        int o=c.length;
        
        ArrayList<Integer>res=new ArrayList<>();
        
        int i=0,j=0,k=0;
        
        while(i<n && j<m && k<o){
            
            if(a[i]==b[j] && b[j]==c[k]){
                int val=a[i];
                res.add(a[i]);
                i++;
                j++;
                k++;
                
                while(i<n && a[i]==val) i++;
                while(j<m && b[j]==val)j++;
                while(k<o && c[k]==val)k++;
            }
            else{
                if(a[i]<=b[j]){
                    if(a[i]<=c[k]){
                        i++;
                    }
                    else{
                        k++;
                    }
                }
                else if(b[j]<=c[k]){
                    j++;
                }
                else{
                    k++;
                }
            }
        }
        return res;
    }
}
