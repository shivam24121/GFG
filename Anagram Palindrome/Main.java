class Solution {
    boolean canFormPalindrome(String s) {
        
        int[] freq=new int[26];
        
        for(int i=0;i<s.length();i++){
            int c=s.charAt(i)-'a';
            freq[c]++;
        }
        int odd=0;
        for(int i=0;i<26;i++){
            if(freq[i]==0)continue;
            if(freq[i]%2==1){
                odd++;
                if(odd>1){
                    return false;
                }
            }
        }
        return true;
    }
}
