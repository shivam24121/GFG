class Solution {
    public int maxProfit(int x, int y, int[] a, int[] b) {
        
        ArrayList<int[]>list=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            list.add(new int[]{Math.abs(a[i]-b[i]),i});
        }
        int one=0;
        int two=0;
        
        Collections.sort(list,(aa,bb)->Integer.compare(bb[0],aa[0]));
        
        int res=0;
        
        for(int i=0;i<a.length;i++){
            
            int idx=list.get(i)[1];
            
            if(a[idx]>=b[idx]){
                if(one<x){
                    res+=a[idx];
                    one++;
                }
                else{
                    res+=b[idx];
                    two++;
                }
            }
            else{
                if(two<y){
                    res+=b[idx];
                    two++;
                }
                else{
                    res+=a[idx];
                    one++;
                }
            }
        }
        return res;
    }
}
