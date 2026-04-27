class Solution {
    public int smallestSubstring(String s) {
        
        int n=s.length();
        int res=Integer.MAX_VALUE;
        int l=0;
        Map<Integer,Integer>map=new HashMap<>();
        
        for(int r=0;r<n;r++){
            int c=s.charAt(r)-'0';
            // System.out.print("before "+map);
            map.put(c,map.getOrDefault(c,0)+1);
            // System.out.println(" after "+map);
            while(map.size()==3){
                res=Math.min(res,r-l+1);
                int temp=s.charAt(l)-'0';
                map.put(temp,map.getOrDefault(temp,0)-1);
                if(map.get(temp)<=0){
                    map.remove(temp);
                }
                l++;
            }
        }
        return res==Integer.MAX_VALUE?-1:res;
    }
};
