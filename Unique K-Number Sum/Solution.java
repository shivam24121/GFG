class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum(int n, int k) {
        ArrayList<ArrayList<Integer>>res=new ArrayList<>();
        solve(n,k,1,res,new ArrayList<>());
        return res;
    }
    public void solve(int n,int k,int st,ArrayList<ArrayList<Integer>>res,ArrayList<Integer>temp){
        int sum=temp.stream().mapToInt(Integer::intValue).sum();
        if(temp.size()==k && 0==n){
            res.add(new ArrayList<>(temp));
            
        }
        if(n<0 || temp.size()>k)return;
        
        for(int i=st;i<=9;i++){
            temp.add(i);
            solve(n-i,k,i+1,res,temp);
            temp.remove(temp.size()-1);
            
        }
    }
}
