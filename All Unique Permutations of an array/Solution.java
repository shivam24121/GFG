class Solution {
    public static ArrayList<ArrayList<Integer>> uniquePerms(int[] arr) {
        
        ArrayList<ArrayList<Integer>>res=new ArrayList<>();
        boolean[] seen=new boolean[arr.length];
        solve(arr,res,new ArrayList<>(),seen);
        return res;
    }
    public static void solve(int[] arr,ArrayList<ArrayList<Integer>>res,ArrayList<Integer>temp,boolean[] seen){
        if(temp.size()==arr.length){
            res.add(new ArrayList<>(temp));
        }
        else{
            for(int i=0;i<arr.length;i++){
                if(seen[i])continue;
                if(i>0 && arr[i]==arr[i-1] && !seen[i-1])continue;
                
                seen[i]=true;
                temp.add(arr[i]);
                solve(arr,res,temp,seen);
                temp.remove(temp.size()-1);
                seen[i]=false;
            }
        }
    }
};
