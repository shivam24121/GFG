class Solution {
    public int smallestSubstring(String S) {
        HashMap<Character,Integer>map=new HashMap<>();
        int n=S.length();
        int res=Integer.MAX_VALUE;
        int l=0;
        for(int r=0;r<n;r++){
            char c=S.charAt(r);
            map.put(c,map.getOrDefault(c,0)+1);
            while(map.size()>=3){
                res=Math.min(res,r-l+1);
                char left=S.charAt(l);
                map.put(left,map.getOrDefault(left,0)-1);
                if(map.get(left)==0){
                    map.remove(left);
                }
                l++;
            }
        }
        return res==Integer.MAX_VALUE?-1:res;
    }
}
