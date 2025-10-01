class Solution {
    public ArrayList<String> findPermutation(String s) {
        StringBuilder sb=new StringBuilder();
        ArrayList<String> res=new ArrayList<>();
        char[] nums=s.toCharArray();
        solve(nums,sb,res);
        return res;
    }
    public void solve(char[] nums,StringBuilder sb,ArrayList<String>res){
        if(sb.length()==nums.length){
            res.add(sb.toString());
        }
        else{
            for(int i=0;i<nums.length;i++){
                if(sb.indexOf(String.valueOf(nums[i]))>=0)continue;
                sb.append(nums[i]);
                solve(nums,sb,res);
                sb.setLength(sb.length()-1);
            }
        }
    }
}
