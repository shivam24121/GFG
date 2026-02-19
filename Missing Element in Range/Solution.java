class Solution {
    public ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        Set<Integer>set=new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
        ArrayList<Integer>res=new ArrayList<>();
        for(int i=low;i<=high;i++){
            if(!set.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
}
