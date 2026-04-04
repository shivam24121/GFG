class Solution {
    public ArrayList<String> graycode(int n) {
        
        ArrayList<String>res=new ArrayList<>();
        if(n==1){
            res.add(String.valueOf(0));
            res.add(String.valueOf(1));
            return res;
        }
        ArrayList<String>prev=graycode(n-1);
        
        for(String s:prev){
            res.add("0"+s);
        }
        for(int i=prev.size()-1;i>=0;i--){
            res.add("1"+prev.get(i));
        }
        return res;
    }
}
