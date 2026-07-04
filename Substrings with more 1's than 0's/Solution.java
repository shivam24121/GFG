class Solution {
    public int countSubstring(String s) {
        
        int n=s.length();
        Map<Integer,Integer>map=new HashMap<>();
        
        int res=0;
        int prefix=0;
        int valid=0;
        
        map.put(0,1);
        
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            
            if(c=='1'){
                valid+=map.getOrDefault(prefix,0);
                prefix++;
            }
            else{
                prefix--;
                valid-=map.getOrDefault(prefix,0);
            }
            res+=valid;
            map.put(prefix,map.getOrDefault(prefix,0)+1);
        }
        return res;
    }
}
