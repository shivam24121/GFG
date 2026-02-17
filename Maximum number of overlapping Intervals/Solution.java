class Solution {
    public static int overlapInt(int[][] arr) {
        int n=arr.length;
        Arrays.sort(arr,(a,b)->(a[0]-b[0]));
        int[] res=new int[1000002];
        
        for(int[] e:arr){
            
            int l=e[0];
            int r=e[1];
            
            res[l]++;
            res[r+1]--;
        }
        int prefix=0;
        int max=-1;
        
        for(int i=0;i<res.length;i++){
            prefix+=res[i];
            max=Math.max(max,prefix);
        }
        return max;
    }
}
