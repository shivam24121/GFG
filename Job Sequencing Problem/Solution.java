class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        var set=new HashSet<Integer>();
        for(int i:a){
            set.add(i);
        }
        for(int i:b){
            set.add(i);
        }
        return new ArrayList<>(set);
    }
}
