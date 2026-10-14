class Solution {
    public String findRollOut(String s, int[] roll) {
        
        int n=s.length();
        
        int[] freq=new int[n+1];
        
        for(int i:roll){
            i--;
            freq[i]++;
            
        }
        for(int i=n-1;i>=0;i--){
            freq[i]+=freq[i+1];
        }
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<n;i++){
            
            int shift=freq[i];
            int temp=((s.charAt(i)-'a')+shift)%26;
            sb.append((char)('a'+temp));
        }
        return sb.toString();
    }
}
