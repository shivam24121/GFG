class Solution {
    ArrayList<Integer> intersection(int[] a, int[] b) {
        ArrayList<Integer>res=new ArrayList<>();
        Set<Integer>set=new HashSet<>();
        for(int i:a){
            set.add(i);
        }
        for(int i:b){
            if(set.contains(i)){
                res.add(i);
                set.remove(i);
            }
        }
        return res;
    }
}
