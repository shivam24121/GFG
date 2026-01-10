class Solution {
    public int countSubstr(String s, int k) {
        return solve(s,k)-solve(s,k-1);
    }
    public int solve(String s,int k){
        Map<Character,Integer>map=new HashMap<>();
        int l=0;
        int count=0;
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
            
            while(map.size()>k){
                char d=s.charAt(l);
                map.put(d,map.getOrDefault(d,0)-1);
                if(map.get(d)==0){
                    map.remove(d);
                }
                l++;
            }
            count+=(i-l+1);
        }
        return count;
    }
}
