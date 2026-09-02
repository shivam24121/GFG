class Solution {
    public int solve(int n, String s) {
        Set<Character>set=new HashSet<>();
        Set<Character>block=new HashSet<>();
        int ct=0;
        for(char c:s.toCharArray()){
            if(block.contains(c))continue;
            if(set.contains(c)){
                set.remove(c);
            }
            else if(set.size()==n){
                ct++;
                block.add(c);
            }
            else{
                set.add(c);
            }
            // System.out.println(set+" "+ct);
        }
        return ct;
    }
}
