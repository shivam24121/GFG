class Solution {
    int[] smallestDiff(int a[], int b[], int c[]) {
        
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        
        int n=a.length;
        
        ArrayList<Integer>res=new ArrayList<>();
        
        int maxDiff=Integer.MAX_VALUE;
        
        int i=0,j=0,k=0;
        
        while(i<n && j<n && k<n){
            int a1=a[i];
            int b1=b[j];
            int c1=c[k];
            
            int diff=Math.max(Math.abs(a1-b1),Math.max(Math.abs(a1-c1),Math.abs(b1-c1)));
            
            //System.out.println(diff);
            
            if(diff<maxDiff){
                maxDiff=diff;
                res.clear();
                res.add(a1);
                res.add(b1);
                res.add(c1);
            }
            
            if(a1<b1){
                if(a1<c1)i++;
                else k++;
            }
            else if(b1<c1){
                j++;
            }
            else
            k++;
        
        }
        Collections.sort(res,Collections.reverseOrder());
        
        int[] ans=new int[3];
        
        for(int x=0;x<3;x++){
            ans[x]=res.get(x);
        }
        return ans;
    }
}
