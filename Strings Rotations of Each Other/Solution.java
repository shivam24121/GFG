class Solution {
    public boolean areRotations(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        return solve(s1+s1,s2);
    }
    public boolean solve(String s1,String s2){
        int m=s1.length();
        int n=s2.length();
        
        int[] kmp=helper(s2);
        int i=0,j=0;
        
        while(i<m){
            if(s1.charAt(i)==s2.charAt(j)){
                i++;
                j++;
                if(j==n)return true;
            }
            else if(j!=0){
                j=kmp[j-1];
            }
            else{
                i++;
            }
        }
        return false;
    }
    public int[] helper(String s){
        int[] arr=new int[s.length()];
        
        int i=0,j=1;
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                arr[j]=i;
                j++;
            }
            else if(i!=0){
                i=arr[i-1];
            }
            else{
                arr[j]=0;
                j++;
            }
        }
        return arr;
    }
}
