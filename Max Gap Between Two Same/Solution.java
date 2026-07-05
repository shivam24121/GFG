class Solution {
    public int maxCharGap(String s) {
        
        int n=s.length();
        int[] arr=new int[26];
        Arrays.fill(arr,-1);
        int res=0;
        boolean fl=false;
        
        for(int i=0;i<n;i++){
            int idx=s.charAt(i)-'a';
            if(arr[idx]!=-1){
                res=Math.max(res,i-arr[idx]-1);
                fl=true;
            }
            if(arr[idx]==-1){
                arr[idx]=i;
            }
        }
        return fl?res:-1;
    }
};
