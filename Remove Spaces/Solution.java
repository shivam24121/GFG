class Solution {
    String removeSpaces(String s) {
        
        StringBuilder sb=new StringBuilder();
        String[] strs=s.split(" ");
        
        for(String a:strs){
            sb.append(a);
        }
        return sb.toString();
    }
}
