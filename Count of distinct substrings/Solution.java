class trie{
    trie[] child=new trie[26];
}
class Solution {
    public static int countSubs(String s) {
        int n=s.length();
        trie root=new trie();
        int res=0;
        
        for(int i=0;i<n;i++){
            trie curr=root;
            for(int j=i;j<n;j++){
                int temp=s.charAt(j)-'a';
                
                if(curr.child[temp]==null){
                    curr.child[temp]=new trie();
                    res++;
                }
                curr=curr.child[temp];
            }
        }
        return res;
    }
}
