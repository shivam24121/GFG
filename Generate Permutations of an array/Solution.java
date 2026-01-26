class Solution {
    
    static ArrayList<ArrayList<Integer>>res;
    static int n;
    
    public static ArrayList<ArrayList<Integer>> permuteDist(int[] arr) {
        n=arr.length;
        res=new ArrayList<>();
        HashSet<Integer>set=new HashSet<>();
        ArrayList<Integer>temp=new ArrayList<>();
        solve(arr,set,temp);
        return res;
    }
    public static void solve(int[] nums,HashSet<Integer>set,ArrayList<Integer>temp){
        if(temp.size()==n){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<n;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                temp.add(nums[i]);
                solve(nums,set,temp);
                
                set.remove(nums[i]);
                temp.remove(temp.size()-1);
            }
        }
    }
};
