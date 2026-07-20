class Solution {
    class Node{
        Node[] next=new Node[26];
        int cnt;
    }

    Node root=new Node();

    void insert(String s){
        Node cur=root;
        for(char c:s.toCharArray()){
            int idx=c-'a';
            if(cur.next[idx]==null)
                cur.next[idx]=new Node();
            cur=cur.next[idx];
            cur.cnt++;
        }
    }

    String find(String s){
        Node cur=root;
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            cur=cur.next[c-'a'];
            sb.append(c);
            if(cur.cnt==1)
                break;
        }
        return sb.toString();
    }

    public ArrayList<String> findPrefixes(String[] arr){
        for(String s:arr)
            insert(s);

        ArrayList<String> ans=new ArrayList<>();
        for(String s:arr)
            ans.add(find(s));
        return ans;
    }
}
