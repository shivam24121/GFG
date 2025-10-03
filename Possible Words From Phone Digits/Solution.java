class Solution {
    static String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public ArrayList<String> possibleWords(int[] arr) {
        ArrayList<String>res=new ArrayList<>();
        solve(arr,0,res,new StringBuilder());
        return res;
    }
    public static void solve(int[] nums,int idx,ArrayList<String>res,StringBuilder sb){
        if(idx==nums.length){
            res.add(sb.toString());
            return;
        }
        String temp=map[nums[idx]];
        if(temp.length()==0){
            solve(nums,idx+1,res,sb);
        }
        else{
            for(char c:temp.toCharArray()){
                sb.append(c);
                solve(nums,idx+1,res,sb);
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
}
