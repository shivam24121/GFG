class Solution {
    public boolean kSubstr(String s, int k) {
        
        Map<String,Integer>map=new HashMap<>();
        int n=s.length();
        
        for(int i=0;i<=n-k;i+=k){
            String curr=s.substring(i,i+k);
            map.put(curr,map.getOrDefault(curr,0)+1);
        }
        // System.out.println(map);
        if(map.size()>2){
            return false;
        }
        int a=0;
        int b=0;
        
        for(var e:map.entrySet()){
            if(a==0){
                a=e.getValue();
            }
            else{
                b=e.getValue();
            }
        }
        // System.out.println(a+" "+b);
        if(Math.min(a,b)>1)return false;
        return true;
    }
}
