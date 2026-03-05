class Solution {
    public int longestKSubstr(String s, int k) {
        int res=Integer.MIN_VALUE;
        int l=0;
        int n=s.length();
        
        Map<Character,Integer>map=new HashMap<>();
        for(int r=0;r<n;r++){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            
            while(map.size()>k){
                char c=s.charAt(l);
                map.put(c,map.getOrDefault(c,0)-1);
                if(map.get(c)==0){
                    map.remove(c);
                }
                l++;
            }
            if(map.size()==k){
                res=Math.max(res,r-l+1);
            }
        }
        return res==Integer.MIN_VALUE?-1:res;
    }
}
