class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer>res=new ArrayList<>();
        Set<Integer>set=new HashSet<>();
        for(int i:arr){
            if(set.contains(i)){
                res.add(i);
            }
            set.add(i);
        }
        return res;
    }
}
