class Solution {
    public ArrayList<String> generateBinary(int n) {
        ArrayList<String>res=new ArrayList<>();
        for(int i=1;i<=n;i++){
            String s=Integer.toBinaryString(i);
            res.add(s);
        }
        return res;
    }
}
