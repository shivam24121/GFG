class Solution {
    public String firstNonRepeating(String s) {
        
        int n=s.length();
        HashMap<Character,Integer>map=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        

        int j=0;
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            
            map.put(c,map.getOrDefault(c,0)+1);
            
            while(j<=i && map.get(s.charAt(j))>1){
                j++;
            }
            if(j>i){
                sb.append('#');
            }
            else{
                sb.append(s.charAt(j));
            }
        }
        return sb.toString();
    }
}
