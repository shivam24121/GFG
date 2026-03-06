class Solution {
    public static String minWindow(String s, String p) {
        
        int n=s.length();
        int m=p.length();
        
        if(m>n)return "";
        
        Map<Character,Integer>map=new HashMap<>();
        for(int i=0;i<m;i++){
            char c=p.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        int ct=m;
        int l=0;
        int idx=0;
        int res=Integer.MAX_VALUE;
        
        for(int r=0;r<n;r++){
            char c=s.charAt(r);
            if(map.getOrDefault(c,0)>0){
                ct--;
            }
            map.put(c,map.getOrDefault(c,0)-1);
            
            while(ct==0){
                int len=r-l+1;
                if(len<res){
                    res=len;
                    idx=l;
                }
                
                char ch=s.charAt(l);
                if(map.getOrDefault(ch,0)==0){
                    ct++;
                }
                map.put(ch,map.getOrDefault(ch,0)+1);
                l++;
            }
        }
        return res==Integer.MAX_VALUE?"":s.substring(idx,idx+res);
    }
}
