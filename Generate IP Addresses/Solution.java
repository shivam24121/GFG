class Solution {
    public ArrayList<String> generateIp(String s) {
        ArrayList<String>res=new ArrayList<>();
        solve(0,0,"",s,res);
        return res;
    }
    public void solve(int idx,int len,String curr,String s,ArrayList<String>res){
        if(len==4 && idx==s.length()){
            res.add(curr.substring(0,curr.length()-1));
            return;
        }
        if(len==4 || idx==s.length()){
            return;
        }
        for(int i=1;i<=3 && idx+i<=s.length();i++){
            String temp=s.substring(idx,idx+i);
            int currNum=Integer.parseInt(temp);
            if((temp.length()>1 && temp.charAt(0)=='0') || currNum>255)continue;
            solve(idx+i,len+1,curr+s.substring(idx,idx+i)+'.',s,res);
        }
    }
}
