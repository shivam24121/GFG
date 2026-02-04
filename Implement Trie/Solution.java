// User function Template for Java
class Trie {

    static class Node{
        Node[] child;
        boolean eow;
        
        Node(){
            child=new Node[26];
        }
    }
    static Node root;
    
    public Trie() {
        
        root=new Node();
    }

    public void insert(String word) {
        Node curr=root;
        
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            
            if(curr.child[idx]==null){
                curr.child[idx]=new Node();
            }
            curr=curr.child[idx];
        }
        curr.eow=true;
    }

    public boolean search(String word) {
        Node curr=root;
        
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            
            if(curr.child[idx]==null)return false;
            
            curr=curr.child[idx];
        }
        return curr.eow;
    }

    public boolean isPrefix(String word) {
        Node curr=root;
        
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            
            if(curr.child[idx]==null)return false;
            
            curr=curr.child[idx];
        }
        return true;
    }
}
