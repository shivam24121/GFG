class Solution {
    public String findRollOut(String s, List<Integer> roll) {
        
        int n=s.length();
        int[] freq=new int[n+1];
        for(int i:roll){
            freq[0]++;
            if(i<n)freq[i]--;
        }
        for(int i=1;i<n;i++){
            freq[i]+=freq[i-1];
        }
        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int shift=freq[i]%26;
            char temp=(char)('a'+(c-'a'+shift)%26);
            sb.append(temp);
        }
        return sb.toString();
    }
}
